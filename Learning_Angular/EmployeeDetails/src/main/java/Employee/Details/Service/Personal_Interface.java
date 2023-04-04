package Employee.Details.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import Employee.Details.Model.personal_information;

public interface Personal_Interface {

	public personal_information create(personal_information user);
	public List<personal_information> getAllpersons();
	public Optional<personal_information> findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();
}

