package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.Education;

import Employee.Details.Repository.Education_repository;

@Service
public class Education_Service implements Education_interface{

	@Autowired
	Education_repository education_repository;

	@Override
	public Education create(Education user) {
		
		return education_repository.save(user);
	}

	@Override
	public List<Education> getAllpersons() {
		
		return (List<Education>) education_repository.findAll();
	}

	@Override
	public Optional<Education> findOne(int id) {
		return education_repository.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
		education_repository.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		education_repository.deleteAll();
		
	}
}
