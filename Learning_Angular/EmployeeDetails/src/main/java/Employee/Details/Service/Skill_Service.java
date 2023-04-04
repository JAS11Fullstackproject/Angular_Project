package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.skills;
import Employee.Details.Repository.Skillrepository;

@Service
public class Skill_Service implements Skill_interface{

	@Autowired
	Skillrepository skillrepository;

	@Override
	public skills create(skills user) {
		
		return skillrepository.save(user);
	}

	@Override
	public List<skills> getAllpersons() {
		
		return (List<skills>) skillrepository.findAll();
	}

	@Override
	public Optional<skills> findOne(int id) {
		return skillrepository.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
	
		skillrepository.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		skillrepository.deleteAll();
		
	}
	
}
