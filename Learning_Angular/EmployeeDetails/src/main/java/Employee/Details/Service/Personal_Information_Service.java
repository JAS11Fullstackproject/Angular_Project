package Employee.Details.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.personal_information;
import Employee.Details.Repository.Personal_Information_Repository;



@Service
public class Personal_Information_Service implements Personal_Interface{
	
	@Autowired Personal_Information_Repository information_Repository;

	@Override
	public personal_information create(personal_information user) {
		
		return information_Repository.save(user);
	}

	@Override
	public List<personal_information> getAllpersons() {
		
		return (List<personal_information>) information_Repository.findAll();
	}

	@Override
	public Optional<personal_information> findOne(int id) {
	
		return information_Repository.findById(id);
		//return information_Repository.findById(id).get();
	}

	@Override
	public boolean deleteById(int id) {
		information_Repository.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		information_Repository.deleteAll();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public Personal_Information createuser(Personal_Information user)
//	{
//		return information_Repository.save(user);
//	}
//	
//	@Override
//	public List<Personal_Information> getAllperson(){
//		return (List<Personal_Information>) information_Repository.findAll();
//	}
//	
//	@Override
//	public Optional<Personal_Information> findOne(int id) {
//		return information_Repository.findById(id);
//	}
//
//	@Override
//	public void deleteUserById(int id) {
//		information_Repository.deleteById(id);
//		
//	}
}
