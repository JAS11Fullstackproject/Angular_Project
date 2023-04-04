package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.language;
import Employee.Details.Repository.language_repository;

@Service
public class language_service implements language_interface{
	@Autowired
	language_repository language_repositorys;

	@Override
	public language create(language user) {
		
		return language_repositorys.save(user);
	}

	@Override
	public List<language> getAllpersons() {
		
		return (List<language>) language_repositorys.findAll();
	}

//	@Override
//	public Optional<language> findOne(int id) {
//		return language_repositorys.findById(id);
//	}

	@Override
	public boolean deleteById(int id) {
		language_repositorys.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		language_repositorys.deleteAll();
		
	}

	@Override
	public language findOne(int id) {
		return language_repositorys.findById(id).get();
	}
}

