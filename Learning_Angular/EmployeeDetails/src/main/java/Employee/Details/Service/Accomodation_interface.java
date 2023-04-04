package Employee.Details.Service;

import java.util.List;
import java.util.Optional;

import Employee.Details.Model.Accomodation;

public interface Accomodation_interface {

	public Accomodation create(Accomodation user);
	public List<Accomodation> getAllpersons();
	public Optional<Accomodation> findOne(Long accommodationId);
	public boolean deleteById(Long accommodationId);
	void deleteAll();
}
