package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Details.Model.fileupload;
import Employee.Details.Model.personal_information;
import Employee.Details.Repository.fileupload_repository;

@Service
public class fileupload_service implements fileupload_interface{
	
	@Autowired
	fileupload_repository fileupload_repositorys;

	@Override
	public fileupload create(fileupload user) {
		return fileupload_repositorys.save(user);
	}

	@Override
	public List<fileupload> getAllpersons() {
		return (List<fileupload>) fileupload_repositorys.findAll();
	}

	@Override
	public fileupload findOne(int id) {
		return fileupload_repositorys.findById(id).get();
	}

	@Override
	public boolean deleteById(int id) {
		fileupload_repositorys.deleteById(id);
		return true;
	}

	@Override
	public void deleteAll() {
		fileupload_repositorys.deleteAll();
		
	}

}
