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

import Employee.Details.Model.Accomodation;
import Employee.Details.Service.Accomodation_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/acc")
@CrossOrigin("*")
public class Accomodation_controller {

	@Autowired
	Accomodation_service accomodation_service;
	
	@PostMapping
	public ResponseEntity<Accomodation> createuser(@Valid @RequestBody Accomodation user)
	{
		Accomodation saveuser=accomodation_service.create(user);
		return new ResponseEntity<Accomodation>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Accomodation> getAllperson(){
		return accomodation_service.getAllpersons();
	}
	
	@GetMapping("{accommodationId}")
	public ResponseEntity<Optional<Accomodation>> findUserById(@PathVariable(value = "accommodationId") Long accommodationId) {
    	Optional<Accomodation> user = accomodation_service.findOne(accommodationId);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{accommodationId}")
	public String updateperson(@RequestBody Accomodation user, @PathVariable(value = "accommodationId") Long accommodationId) {

		Optional<Accomodation> personOptional = accomodation_service.findOne(accommodationId);

		if (personOptional.isEmpty()) {
			return "No data in this id";
		}
		else {
			user.setAccommodationId(accommodationId);
		
		accomodation_service.create(user);

		return "updated";
		}
	}

	@DeleteMapping("{accommodationId}")
	public String deleteUserById(@PathVariable(value = "accommodationId") Long accommodationId) {
		accomodation_service.deleteById(accommodationId);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		accomodation_service.deleteAll();
		return "Deleted All Success";
		}
	
}
