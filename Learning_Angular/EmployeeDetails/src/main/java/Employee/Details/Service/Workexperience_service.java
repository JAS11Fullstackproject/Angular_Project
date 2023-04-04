package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.Workexperience;
import Employee.Details.Repository.Work_repository;

@Service
public class Workexperience_service implements Workexperience_interface{

	@Autowired
	Work_repository repository;

	@Override
	public Workexperience create(Workexperience user) {
		
		return repository.save(user);
	}

	@Override
	public List<Workexperience> getAllpersons() {
		
		return (List<Workexperience>) repository.findAll();
	}

	@Override
	public Optional<Workexperience> findOne(Long workexperienceId) {
		return repository.findById(workexperienceId);
	}

	@Override
	public boolean deleteById(Long workexperienceId) {
		repository.deleteById(workexperienceId);
		return true;
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}
	
}
