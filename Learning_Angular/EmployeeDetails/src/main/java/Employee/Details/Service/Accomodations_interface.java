package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.Accomodations;

public interface Accomodations_interface {

	public Accomodations create(Accomodations user);
	public List<Accomodations> getAllpersons();
	public Optional<Accomodations> findOne(Long accommodationsId);
	public boolean deleteById (Long accommodationsId);
	void deleteAll();
}
