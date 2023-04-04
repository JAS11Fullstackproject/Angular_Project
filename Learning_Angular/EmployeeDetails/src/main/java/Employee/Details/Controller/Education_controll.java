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

import Employee.Details.Model.Education;
import Employee.Details.Service.Education_Service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/education")
@CrossOrigin("*")
public class Education_controll {

	@Autowired
	Education_Service education_Service;
	
	@PostMapping
	public ResponseEntity<Education> createuser(@Valid @RequestBody Education user)
	{
		Education saveuser=education_Service.create(user);
		return new ResponseEntity<Education>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Education> getAllperson(){
		return education_Service.getAllpersons();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Education>> findUserById(@PathVariable(value = "id") int id) {
    	Optional<Education> user = education_Service.findOne(id);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{id}")
	public String updateperson(@RequestBody Education user, @PathVariable int id) {

		Optional<Education> personOptional =education_Service.findOne(id);
		
		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setId(id);
		
		education_Service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable(value = "id") int id) {
		education_Service.deleteById(id);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		education_Service.deleteAll();
		return "Deleted All Success";
		}
	
}
