package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.skills;

public interface Skill_interface {

	public skills create(skills user);
	public List<skills> getAllpersons();
	public Optional<skills> findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();
}
