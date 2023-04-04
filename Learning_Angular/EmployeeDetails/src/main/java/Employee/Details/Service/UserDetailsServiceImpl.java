package Employee.Details.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Employee.Details.Model.User;
import Employee.Details.Repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
    UserRepository userRepository;

	@Override
    @Transactional
    public UserDetails loadUserByUsername(String email) 
                       throws UsernameNotFoundException {
        User user = (User) userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException
             ("user Not Found with username: " + email));

        return UserDetailsImpl.build((User) user);
    }
}
