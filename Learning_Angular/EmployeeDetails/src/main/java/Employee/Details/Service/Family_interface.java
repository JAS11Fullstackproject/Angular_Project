package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.Education;
import Employee.Details.Model.Family_detail;

public interface Family_interface {

	public Family_detail create(Family_detail user);
	public List<Family_detail> getAllpersons();
	public Optional<Family_detail> findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();
}
