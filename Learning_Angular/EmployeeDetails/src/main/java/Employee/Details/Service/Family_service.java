package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Employee.Details.Model.Family_detail;
import Employee.Details.Repository.Family_repository;

@Service
public class Family_service implements Family_interface{

	
	@Autowired
	Family_repository family_repository;

	@Override
	public Family_detail create(Family_detail user) {
		
		return family_repository.save(user);
	}

	@Override
	public List<Family_detail> getAllpersons() {
		
		return (List<Family_detail>) family_repository.findAll();
	}

	@Override
	public Optional<Family_detail> findOne(int id) {
		return family_repository.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
		family_repository.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		family_repository.deleteAll();
		
	}
}
