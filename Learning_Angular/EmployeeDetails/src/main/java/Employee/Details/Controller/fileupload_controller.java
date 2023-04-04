package Employee.Details.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import Employee.Details.Model.fileupload;
import Employee.Details.Service.Personal_Information_Service;
import Employee.Details.Service.fileupload_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/file")
@CrossOrigin("*")
public class fileupload_controller {
	
	@Autowired 
	fileupload_service fileupload_services;
	
	@Autowired
	ObjectMapper mapper;
	
	@PostMapping(path = "",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<fileupload> createuser(@Valid @RequestPart("Data") String Datas, @RequestPart(name="files",required = true) MultipartFile[] files) throws Exception 
	{
		
		fileupload obj=this.mapper.readValue(Datas, fileupload.class);
		obj.setStatus("Active");	       
			String fileName=null;
			
			for (MultipartFile multipartFile : files) {
			fileName=multipartFile.getOriginalFilename();
				if(fileName.equalsIgnoreCase("Fourth1.jpg") && !fileName.isBlank()) {
					obj.setPassport_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
					
				}else if(fileName.equalsIgnoreCase("Fourth2.jpg") && !fileName.isBlank()) {
					obj.setAadhar_copy( java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
					
				}else if (fileName.equalsIgnoreCase("Fourth3.jpg") && !fileName.isBlank()) {
					obj.setDriving_license_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
					
				}							
			}
			fileupload saveuser=fileupload_services.create(obj);
			return new ResponseEntity<fileupload>(saveuser,HttpStatus.CREATED);
	}
	
	
//	@GetMapping(path = "/getAll")
//	public ResponseEntity<List<fileupload>> getAllperson() throws Exception
//	{
//		List<fileupload> obj=fileupload_services.getAllpersons();
//		List<fileupload> get=new ArrayList<>();
//		
//		 for (int i = 0; i < obj.size(); i++) {
//			 fileupload list=obj.get(i);
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
	
	@GetMapping(path = "/get/{id}")
	public ResponseEntity<fileupload> findUserById(@PathVariable(value = "id") int id) {
		
    	fileupload obj=fileupload_services.findOne(id);
    	if(obj.getStatus().equalsIgnoreCase("Active")) {
    		if(obj.getPassport_copy()!=null) {
    		
    			obj.setPassport_copy(java.util.Base64.getDecoder().decode(obj.getPassport_copy()));
    		}
    			if(obj.getAadhar_copy()!=null) {
    				obj.setAadhar_copy(java.util.Base64.getDecoder().decode(obj.getAadhar_copy()));
    			}
    				if(obj.getDriving_license_copy()!=null) {
    					obj.setDriving_license_copy(java.util.Base64.getDecoder().decode(obj.getDriving_license_copy()));
    				}
    		 }
    	else
    	{
    		return ResponseEntity.notFound().build();
    	}
    	
	return ResponseEntity.ok().body(obj);
}
	@PutMapping(path = "/update/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public String updateperson(@RequestPart("Data") String Datas, @RequestPart("files") MultipartFile[] files, @PathVariable int id) throws Exception
	{
		fileupload obj=fileupload_services.findOne(id);
		fileupload get=this.mapper.readValue(Datas, fileupload.class);
		
		if(obj.getStatus().equalsIgnoreCase("Active")) {
			get.setId(id);       
			String fileName=null;
			
			for (MultipartFile multipartFile : files)  {
			fileName=multipartFile.getOriginalFilename();
				if(fileName.equalsIgnoreCase("Fourth1.jpg")) {
					get.setPassport_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));								
				}else if(fileName.equalsIgnoreCase("Fourth2.jpg")) {
					get.setAadhar_copy( java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
				}else if (fileName.equalsIgnoreCase("Fourth3.jpg")) {
					get.setDriving_license_copy(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
				}
										
			}
			get.setStatus("Active");
			fileupload_services.create(get);
			return "updated successsfully";
		}
		return "Id not found";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable(value = "id") int id) {
		fileupload obj=fileupload_services.findOne(id);
		if(!fileupload_services.findOne(id).equals(Optional.empty())) 
		{
			obj.setStatus("inActive");
			fileupload_services.create(obj);
			return "deleted successfully";
		}
		return "Id not valid";
	}
	@DeleteMapping("/deleteall")
		public String deleteAll() {
		List<fileupload> obj=fileupload_services.getAllpersons();
		 for (int i = 0; i < obj.size(); i++) {
			 fileupload list=obj.get(i);
			 if(list.getStatus().equalsIgnoreCase("Active")) {
				 list.setStatus("inActive");
					fileupload_services.create(list);
			 }
		 }
		 return "All datas deleted successfully";
			}

}

