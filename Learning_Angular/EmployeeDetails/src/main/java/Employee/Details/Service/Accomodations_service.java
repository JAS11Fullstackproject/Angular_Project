package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.Accomodations;
import Employee.Details.Repository.Accomodations_repository;

@Service
public class Accomodations_service implements Accomodations_interface{

	@Autowired
	Accomodations_repository education_repository;

	@Override
	public Accomodations create(Accomodations user) {
		
		return education_repository.save(user);
	}

	@Override
	public List<Accomodations> getAllpersons() {
		
		return (List<Accomodations>) education_repository.findAll();
	}

	@Override
	public Optional<Accomodations> findOne(Long accommodationsId) {
		return education_repository.findById(accommodationsId);
	}

	@Override
	public boolean deleteById(Long accommodationsId) {
		education_repository.deleteById(accommodationsId);
		return true;
	}

	@Override
	public void deleteAll() {
		education_repository.deleteAll();
		
	}
}
