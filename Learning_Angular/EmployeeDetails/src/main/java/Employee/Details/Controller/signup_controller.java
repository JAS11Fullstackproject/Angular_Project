//package Employee.Details.Controller;
//
//import java.nio.file.attribute.UserPrincipalNotFoundException;
//import java.util.List;
//import java.util.Optional;
//
//import javax.security.auth.login.AccountNotFoundException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import Employee.Details.Model.signup;
//import Employee.Details.Service.signup_service;
//import jakarta.validation.Valid;
//
//@RestController
//@RequestMapping("/signup")
//@CrossOrigin("*")
//public class signup_controller {
//
//		@Autowired
//		signup_service signup_services;
//		
//		@PostMapping("/login")
//		public ResponseEntity<signup> findUserById(@RequestBody signup user) throws UserNotFoundException {
//			Optional<signup> opuser=signup_services.findOne(user.getId());
//			BCryptPasswordEncoder bcript=new BCryptPasswordEncoder();
//			if(opuser.isPresent()) {
//				signup dbuser=opuser.get();
//				if(bcript.matches(user.getPassword(), dbuser.getPassword())) {
//					return ResponseEntity.ok().body(dbuser);
//				}
//				else {
//					return ResponseEntity.notFound().build();
//				}
//			}
//			throw new UserNotFoundException(user);
//		}
//		
//
//		
//		@PostMapping
//		public ResponseEntity<signup> createuser(@Valid @RequestBody signup user)
//		{
//			BCryptPasswordEncoder bcrt=new BCryptPasswordEncoder();
//			String encryptpassword=bcrt.encode(user.getPassword());
//			user.setPassword(encryptpassword);
//			signup saveuser=signup_services.create(user);
//			return new ResponseEntity<signup>(saveuser,HttpStatus.CREATED);
//		}
//		
//		@GetMapping
//		public List<signup> getAllperson(){
//			return signup_services.getAllpersons();
//		}
//		
//		@GetMapping("{id}")
//		public ResponseEntity<Optional<signup>> findUserById(@PathVariable(value = "id") int id){
//			Optional<signup> user = signup_services.findOne(id);
//	    	
//	        if(user==null) {
//	        	return ResponseEntity.notFound().build();
//	        } else {
//	            return ResponseEntity.ok().body(user);
//	        }
//		}
//
//		}
