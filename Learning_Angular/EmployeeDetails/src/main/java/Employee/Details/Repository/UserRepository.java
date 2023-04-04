package Employee.Details.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import Employee.Details.Model.User;


public interface UserRepository extends JpaRepository<User, String>{

	Optional <User> findByEmail(String email);
	Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
