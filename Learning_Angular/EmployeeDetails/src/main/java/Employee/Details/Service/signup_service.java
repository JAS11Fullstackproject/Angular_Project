//package Employee.Details.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import Employee.Details.Model.signup;
//import Employee.Details.Repository.signup_repository;
//
//@Service
//public class signup_service implements signup_interface{
//	
//
//	@Autowired
//	signup_repository signup_repositorys;
//	
//
//	@Override
//	public signup create(signup user) {
//		
//		return signup_repositorys.save(user);
//	}
//
//	@Override
//	public List<signup> getAllpersons() {
//		
//		return (List<signup>) signup_repositorys.findAll();
//	}
//
//	@Override
//	public Optional<signup> findOne(int string) {
//		return signup_repositorys.findById(string);
//	}
//
//}
