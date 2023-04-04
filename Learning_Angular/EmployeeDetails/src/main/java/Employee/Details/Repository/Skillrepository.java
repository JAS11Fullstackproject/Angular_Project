package Employee.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import Employee.Details.Model.skills;

public interface Skillrepository extends JpaRepository<skills, Integer>{

}
