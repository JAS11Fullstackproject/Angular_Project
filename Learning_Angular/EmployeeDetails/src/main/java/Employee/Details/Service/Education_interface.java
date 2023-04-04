package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.Education;

public interface Education_interface {

	public Education create(Education user);
	public List<Education> getAllpersons();
	public Optional<Education> findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();
}
