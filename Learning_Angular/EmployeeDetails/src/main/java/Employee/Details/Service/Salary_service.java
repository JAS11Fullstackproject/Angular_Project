package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Employee.Details.Model.Salary;
import Employee.Details.Repository.Salary_repository;

@Service
public class Salary_service implements Salary_interface{

	@Autowired
	Salary_repository salary_repository;

	@Override
	public Salary create(Salary user) {
		
		return salary_repository.save(user);
	}

	@Override
	public List<Salary> getAllpersons() {
		
		return (List<Salary>) salary_repository.findAll();
	}

	@Override
	public Optional<Salary> findOne(Long salaryId) {
		return salary_repository.findById(salaryId);
	}

	@Override
	public boolean deleteById(Long salaryId) {
	
		salary_repository.deleteById(salaryId);
		return true;
	}

	@Override
	public void deleteAll() {
		salary_repository.deleteAll();
		
	}
}
