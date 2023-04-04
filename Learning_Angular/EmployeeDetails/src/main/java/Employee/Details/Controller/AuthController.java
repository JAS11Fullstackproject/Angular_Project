package Employee.Details.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Employee.Details.Model.User;
import Employee.Details.Repository.UserRepository;
import Employee.Details.Service.UserDetailsImpl;
import Employee.Details.Service.UserDetailsServiceImpl;
import Employee.Details.jwtUtil.JwtUtils;
import Employee.Details.request.LoginRequest;
import Employee.Details.request.SignupRequest;
import Employee.Details.response.JwtResponse;
import Employee.Details.response.MessageResponse;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;
    
    @Autowired
    UserDetailsServiceImpl detailsServiceImpl;

    @Autowired
     JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateuser
               (@RequestBody LoginRequest loginRequest, SignupRequest signupRequest) {
    	
    	 if (!loginRequest.getEmail().isBlank()&& !loginRequest.getPassword().isBlank()) {	 
        Authentication authentication = authenticationManager
              .authenticate
                 (new UsernamePasswordAuthenticationToken
                        (loginRequest.getEmail(), 
                                loginRequest.getPassword()));

        SecurityContextHolder.getContext()
               .setAuthentication(authentication);
        

        UserDetailsImpl userDetails = (UserDetailsImpl) 
                              authentication.getPrincipal();
        String jwt = jwtUtils.generateToken(userDetails);
        return ResponseEntity
                .ok(new JwtResponse(jwt, userDetails.getId(), 
                            userDetails.getEmail()));
    	 }else {
    		 return ResponseEntity.badRequest()
    	                .body(new MessageResponse
    	                  ("Invalid username or password"));
    	 }
    }
    @PostMapping
    public ResponseEntity<?> registerUser
                  (@RequestBody SignupRequest signUpRequest) {

//        if (userRepository.existsByUsername(signUpRequest
//              .getUsername())) {
//
//            return ResponseEntity.badRequest()
//                .body(new MessageResponse
//                  ("Username is already taken!"));
//        }

        if (userRepository.existsByEmail
                           (signUpRequest.getEmail())) {

            return ResponseEntity.badRequest()
                 .body(new MessageResponse
                        ("Email is already in use!"));
        }

        // Create new user account
        User user = new User(signUpRequest.getUsername(), 
                           signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        userRepository.save(user);

        return ResponseEntity
         .ok(new MessageResponse("user registered successfully!"));
    }
    
}
