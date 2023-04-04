package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.fileupload;

public interface fileupload_interface {
	public fileupload create(fileupload user);
	public List<fileupload> getAllpersons();
	public fileupload findOne(int id);
	public boolean deleteById (int id);
	void deleteAll();

}
