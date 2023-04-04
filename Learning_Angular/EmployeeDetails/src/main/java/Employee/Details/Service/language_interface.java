package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.fileupload;
import Employee.Details.Model.language;

public interface language_interface {
	public language create(language user);
	public List<language> getAllpersons();
	//public Optional<language> findOne(int id);
	public language findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();

}
