//package Employee.Details.Controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import Employee.Details.Model.language;
//import Employee.Details.Service.language_service;
//import jakarta.validation.Valid;
//
//
//	@RestController
//	@RequestMapping("/language")
//	@CrossOrigin("*")
//	public class language_controller {
//		@Autowired
//		language_service language_services;
//		
//		@PostMapping
//		public ResponseEntity<language> createuser(@Valid @RequestBody language user)
//		{
//			language saveuser=language_services.create(user);
//			return new ResponseEntity<language>(saveuser,HttpStatus.CREATED);
//		}
//		
//		@GetMapping
//		public List<language> getAllperson(){
//			return language_services.getAllpersons();
//		}
//		
//		@GetMapping("{id}")
//		public ResponseEntity<Optional<language>> findUserById(@PathVariable(value = "id") int id) {
//	    	Optional<language> user = language_services.findOne(id);
//
//	        if(user==null) {
//	        	return ResponseEntity.notFound().build();
//	        } else {
//	            return ResponseEntity.ok().body(user);
//	        }
//		}
//		
//		@PutMapping("{id}")
//		public String updateperson(@RequestBody language user, @PathVariable int id) {
//
//			Optional<language> personOptional = language_services.findOne(id);
//
//			if (personOptional.isEmpty()) {
//				return "No data in this id";
//			}
//			else {
//				user.setId(id);
//			
//			language_services.create(user);
//
//			return "updated";
//			}
//		}
//
//		
//		@DeleteMapping("{id}")
//		public String deleteUserById(@PathVariable(value = "id") int id) {
//			language_services.deleteById(id);
//			return "Deleted Success";
//	    }
//		
//		@DeleteMapping
//		public String deleteall() {
//			language_services.deleteAll();
//			return "Deleted All Success";
//			}
//
//}
