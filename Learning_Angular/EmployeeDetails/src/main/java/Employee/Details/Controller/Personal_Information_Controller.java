package Employee.Details.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import Employee.Details.Model.personal_information;
import Employee.Details.Service.Personal_Information_Service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/personal")
@CrossOrigin("*")
public class Personal_Information_Controller {
	
	@Autowired 
	Personal_Information_Service information_Service;
	
	@Autowired
	ObjectMapper mapper;
	
	@PostMapping
	public ResponseEntity<personal_information> createuser(@Valid @RequestBody personal_information user)
	{
		personal_information saveuser=information_Service.create(user);
		return new ResponseEntity<personal_information>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<personal_information> getAllperson(){
		return information_Service.getAllpersons();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<personal_information>> findUserById(@PathVariable(value = "id") int id) {
    	Optional<personal_information> user = information_Service.findOne(id);

        if(user==null) {
        	return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(user);
        }
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Object> updateperson(@RequestBody personal_information user, @PathVariable int id) {

		Optional<personal_information> personOptional = information_Service.findOne(id);

		if (personOptional.isEmpty())
			return ResponseEntity.notFound().build();

		user.setId(id);
		
		information_Service.create(user);

		return ResponseEntity.noContent().build();
	}

	
	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable(value = "id") int id) {
		information_Service.deleteById(id);
		return "Deleted Success";
    }
	
	@DeleteMapping
	public String deleteall() {
		information_Service.deleteAll();
		return "Deleted All Success";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PostMapping(path = "/save",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
//	public ResponseEntity<Personal_Information> createuser(@Valid @RequestPart("Data") String Datas, @RequestPart(name="files",required = true) MultipartFile[] files) throws Exception 
//	{
//		
//		Personal_Information obj=this.mapper.readValue(Datas, Personal_Information.class);
//		obj.setStatus("Active");	       
//			String fileName=null;
//			
//			for (MultipartFile multipartFile : files) {
//			fileName=multipartFile.getOriginalFilename();
//				if(fileName.equalsIgnoreCase("Fourth1.jpg") && !fileName.isBlank()) {
//					obj.setPassport_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
//					
//				}else if(fileName.equalsIgnoreCase("Fourth2.jpg") && !fileName.isBlank()) {
//					obj.setAadhar_copy( java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
//					
//				}else if (fileName.equalsIgnoreCase("Fourth3.jpg") && !fileName.isBlank()) {
//					obj.setDriving_license_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
//					
//				}							
//			}
//			Personal_Information saveuser=information_Service.create(obj);
//			return new ResponseEntity<Personal_Information>(saveuser,HttpStatus.CREATED);
//	}
//	
//	
//	@GetMapping(path = "/getAll")
//	public ResponseEntity<List<Personal_Information>> getAllperson() throws Exception
//	{
//		List<Personal_Information> obj=information_Service.getAllpersons();
//		List<Personal_Information> get=new ArrayList<>();
//		
//		 for (int i = 0; i < obj.size(); i++) {
//			 Personal_Information list=obj.get(i);
//			 
//			 if(list.getStatus().equalsIgnoreCase("Active")) {
//				 get.add(list);
//				 if(list.getPassport_copy()!=null) {
//					 list.setPassport_copy(java.util.Base64.getDecoder().decode(list.getPassport_copy()));
//				 	}
//				 	if(list.getAadhar_copy()!=null) {
//				 		list.setAadhar_copy(java.util.Base64.getDecoder().decode(list.getAadhar_copy()));
//				 		}
//				 		if(list.getDriving_license_copy()!=null) {
//				 			list.setDriving_license_copy(java.util.Base64.getDecoder().decode(list.getDriving_license_copy()));	
//				 			}
//			 }
//			 
//		 }
//		 return ResponseEntity.ok().body(get);
//	}
//	
//	@GetMapping(path = "/get/{id}")
//	public ResponseEntity<Personal_Information> findUserById(@PathVariable(value = "id") UUID id) {
//		
//    	Personal_Information obj=information_Service.findOne(id);
//    	if(obj.getStatus().equalsIgnoreCase("Active")) {
//    		if(obj.getPassport_copy()!=null) {
//    		
//    			obj.setPassport_copy(java.util.Base64.getDecoder().decode(obj.getPassport_copy()));
//    		}
//    			if(obj.getAadhar_copy()!=null) {
//    				obj.setAadhar_copy(java.util.Base64.getDecoder().decode(obj.getAadhar_copy()));
//    			}
//    				if(obj.getDriving_license_copy()!=null) {
//    					obj.setDriving_license_copy(java.util.Base64.getDecoder().decode(obj.getDriving_license_copy()));
//    				}
//    		 }
//    	else
//    	{
//    		return ResponseEntity.notFound().build();
//    	}
//    	
//	return ResponseEntity.ok().body(obj);
//}
//	@PutMapping(path = "/update/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
//	public String updateperson(@RequestPart("Data") String Datas, @RequestPart("files") MultipartFile[] files, @PathVariable UUID id) throws Exception
//	{
//		Personal_Information obj=information_Service.findOne(id);
//		Personal_Information get=this.mapper.readValue(Datas, Personal_Information.class);
//		
//		if(obj.getStatus().equalsIgnoreCase("Active")) {
//			get.setId(id);       
//			String fileName=null;
//			
//			for (MultipartFile multipartFile : files)  {
//			fileName=multipartFile.getOriginalFilename();
//				if(fileName.equalsIgnoreCase("Fourth1.jpg")) {
//					get.setPassport_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));								
//				}else if(fileName.equalsIgnoreCase("Fourth2.jpg")) {
//					get.setAadhar_copy( java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
//				}else if (fileName.equalsIgnoreCase("Fourth3.jpg")) {
//					get.setDriving_license_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
//				}
//										
//			}
//			get.setStatus("Active");
//			information_Service.create(get);
//			return "updated successsfully";
//		}
//		return "Id not found";
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deleteById(@PathVariable(value = "id") UUID id) {
//		Personal_Information obj=information_Service.findOne(id);
//		if(!information_Service.findOne(id).equals(Optional.empty())) 
//		{
//			obj.setStatus("inActive");
//			information_Service.create(obj);
//			return "deleted successfully";
//		}
//		return "Id not valid";
//	}
//	@DeleteMapping("/deleteall")
//		public String deleteAll() {
//		List<Personal_Information> obj=information_Service.getAllpersons();
//		 for (int i = 0; i < obj.size(); i++) {
//			 Personal_Information list=obj.get(i);
//			 if(list.getStatus().equalsIgnoreCase("Active")) {
//				 list.setStatus("inActive");
//					information_Service.create(list);
//			 }
//		 }
//		 return "All datas deleted successfully";
//			}
}
