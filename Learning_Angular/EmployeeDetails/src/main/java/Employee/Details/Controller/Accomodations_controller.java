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

import Employee.Details.Model.Accomodations;
import Employee.Details.Service.Accomodations_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/acco")
@CrossOrigin("*")
public class Accomodations_controller {

	@Autowired
	Accomodations_service education_Service;
	
	@PostMapping
	public ResponseEntity<Accomodations> createuser(@Valid @RequestBody Accomodations user)
	{
		Accomodations saveuser=education_Service.create(user);
		return new ResponseEntity<Accomodations>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Accomodations> getAllperson(){
		return education_Service.getAllpersons();
	}
	
	@GetMapping("{accommodationsId}")
	public ResponseEntity<Optional<Accomodations>> findUserById(@PathVariable(value = "accommodationsId") Long accommodationsId) {
    	Optional<Accomodations> user = education_Service.findOne(accommodationsId);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{accommodationsId}")
	public String updateperson(@RequestBody Accomodations user, @PathVariable(value = "accommodationsId") Long accommodationsId) {

		Optional<Accomodations> personOptional =education_Service.findOne(accommodationsId);
		
		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setAccomodationsId(accommodationsId);
		
		education_Service.create(user);

		return "updated";
		}
	}

	
	@DeleteMapping("{accommodationsId}")
	public String deleteUserById(@PathVariable(value = "accommodationsId") Long accommodationsId) {
		education_Service.deleteById(accommodationsId);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		education_Service.deleteAll();
		return "Deleted All Success";
		}
	
}
