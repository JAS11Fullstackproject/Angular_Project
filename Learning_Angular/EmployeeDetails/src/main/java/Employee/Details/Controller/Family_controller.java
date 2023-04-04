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
import Employee.Details.Model.Family_detail;
import Employee.Details.Service.Family_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/family")
@CrossOrigin("*")
public class Family_controller {

	@Autowired
	Family_service family_service;
	
	@PostMapping
	public ResponseEntity<Family_detail> createuser(@Valid @RequestBody Family_detail user)
	{
		Family_detail saveuser=family_service.create(user);
		return new ResponseEntity<Family_detail>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Family_detail> getAllperson(){
		return family_service.getAllpersons();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Family_detail>> findUserById(@PathVariable(value = "id") int id) {
    	Optional<Family_detail> user = family_service.findOne(id);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{id}")
	public String updateperson(@RequestBody Family_detail user, @PathVariable int id) {

		Optional<Family_detail> personOptional =family_service.findOne(id);

		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setId(id);
		
		family_service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable(value = "id") int id) {
		family_service.deleteById(id);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		family_service.deleteAll();
		return "Deleted All Success";
		}
	
}
