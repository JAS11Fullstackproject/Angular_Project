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

import Employee.Details.Model.Salary;
import Employee.Details.Service.Salary_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/salary")
@CrossOrigin("*")
public class Salary_controller {

	@Autowired
	Salary_service salary_service;
	
	@PostMapping
	public ResponseEntity<Salary> createuser(@Valid @RequestBody Salary user)
	{
		Salary saveuser=salary_service.create(user);
		return new ResponseEntity<Salary>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Salary> getAllperson(){
		return salary_service.getAllpersons();
	}
	
	@GetMapping("{salaryId}")
	public ResponseEntity<Optional<Salary>> findUserById(@PathVariable(value = "salaryId") Long salaryId) {
    	Optional<Salary> user = salary_service.findOne(salaryId);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{salaryId}")
	public String updateperson(@RequestBody Salary user, @PathVariable Long salaryId) {

		Optional<Salary> personOptional = salary_service.findOne(salaryId);

		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setSalaryId(salaryId);
		
				salary_service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{salaryId}")
	public String deleteUserById(@PathVariable Long salaryId) {
		salary_service.deleteById(salaryId);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		salary_service.deleteAll();
		return "Deleted All Success";
		}
	
}
