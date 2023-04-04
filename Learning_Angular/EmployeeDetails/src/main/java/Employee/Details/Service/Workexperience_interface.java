package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.Accomodation;
import Employee.Details.Model.Workexperience;

public interface Workexperience_interface {

	public Workexperience create(Workexperience user);
	public List<Workexperience> getAllpersons();
	public Optional<Workexperience> findOne(Long workexperienceId);
	public boolean deleteById (Long workexperienceId);
	void deleteAll();
}
