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
import Employee.Details.Model.Workexperience;
import Employee.Details.Service.Workexperience_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/work")
@CrossOrigin("*")
public class Work_controller {

	@Autowired
	Workexperience_service workexperience_service;
	
	@PostMapping
	public ResponseEntity<Workexperience> createuser(@Valid @RequestBody Workexperience user)
	{
		Workexperience saveuser=workexperience_service.create(user);
		return new ResponseEntity<Workexperience>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Workexperience> getAllperson(){
		return workexperience_service.getAllpersons();
	}
	
	@GetMapping("{workexperienceId}")
	public ResponseEntity<Optional<Workexperience>> findUserById(@PathVariable(value = "workexperienceId") Long workexperienceId) {
    	Optional<Workexperience> user = workexperience_service.findOne(workexperienceId);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{workexperienceId}")
	public String updateperson(@RequestBody Workexperience user, @PathVariable Long workexperienceId) {

		Optional<Workexperience> personOptional =workexperience_service.findOne(workexperienceId);

		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setWorkexperienceId(workexperienceId);
		
		workexperience_service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{workexperienceId}")
	public String deleteUserById(@PathVariable Long workexperienceId) {
		workexperience_service.deleteById(workexperienceId);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		workexperience_service.deleteAll();
		return "Deleted All Success";
		}
}
