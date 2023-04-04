package Employee.Details.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Employee.Details.Model.skills;
import Employee.Details.Service.Skill_Service;
import jakarta.validation.Valid;

@RestController
//@RequestMapping("/skill")
@RequestMapping("/api/auth/skill")
@CrossOrigin("*")
public class Skill_controller {

	@Autowired
	Skill_Service skill_Service;
	
	@PostMapping
	public ResponseEntity<skills> createuser(@Valid @RequestBody skills user)
	{
		skills saveuser=skill_Service.create(user);
		return new ResponseEntity<skills>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<skills> getAllperson(){
		return skill_Service.getAllpersons();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<skills>> findUserById(@PathVariable(value = "id") int id) {
    	Optional<skills> user = skill_Service.findOne(id);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{id}")
	public String updateperson(@RequestBody skills user, @PathVariable int id) {

		Optional<skills> personOptional = skill_Service.findOne(id);

		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setId(id);
		
		skill_Service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable(value = "id") int id) {
		skill_Service.deleteById(id);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		skill_Service.deleteAll();
		return "Deleted All Success";
		}
	
	
}
