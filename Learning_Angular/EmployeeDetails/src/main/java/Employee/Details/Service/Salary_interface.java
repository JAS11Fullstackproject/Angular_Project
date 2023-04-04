package Employee.Details.Service;

import java.util.List;
import java.util.Optional;
import Employee.Details.Model.Salary;

public interface Salary_interface {

	public Salary create(Salary user);
	public List<Salary> getAllpersons();
	public Optional<Salary> findOne(Long salaryId);
	public boolean deleteById (Long salaryId);
	void deleteAll();
}
