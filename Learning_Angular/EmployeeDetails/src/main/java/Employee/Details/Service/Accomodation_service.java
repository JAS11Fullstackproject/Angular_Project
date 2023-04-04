package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.Accomodation;
import Employee.Details.Repository.Accomodation_repository;

@Service
public class Accomodation_service implements Accomodation_interface{

	@Autowired
	Accomodation_repository accomodation_repository;
	
	@Override
	public Accomodation create(Accomodation user) {
		
		return accomodation_repository.save(user);
	}

	@Override
	public List<Accomodation> getAllpersons() {
		
		return (List<Accomodation>) accomodation_repository.findAll();
	}

	@Override
	public Optional<Accomodation> findOne(Long id) {

		return accomodation_repository.findById(id);
	}

	@Override
	public boolean deleteById(Long id) {
		accomodation_repository.findById(id);
		return true;
	}

	@Override	
	public void deleteAll() {
		accomodation_repository.deleteAll();
		
	}

	
}
