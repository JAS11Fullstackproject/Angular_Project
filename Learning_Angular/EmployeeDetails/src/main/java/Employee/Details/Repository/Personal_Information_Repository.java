package Employee.Details.Repository;


import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import Employee.Details.Model.personal_information;

public interface Personal_Information_Repository extends CrudRepository<personal_information, Integer>{

}
