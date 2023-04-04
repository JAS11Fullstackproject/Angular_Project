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
import Employee.Details.Model.language;
import Employee.Details.Service.language_service;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/lang")
@CrossOrigin("*")
public class language_file_controller {
	@Autowired 
	 language_service language_services;
	
	@Autowired
	ObjectMapper mapper;
	
	@PostMapping(path = "",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.MULTIPART_FORM_DATA_VALUE,
			headers ={"Accept=application/json"})
	public ResponseEntity<language> createuser(@Valid @RequestPart("Data") String Data,
			@RequestPart(name="files" ,required = false) MultipartFile[] files) throws Exception 
	{
		language obj=this.mapper.readValue(Data, language.class);
			       
			String fileName=null;
			
			if(!(files==null)) {
			for (MultipartFile multipartFile : files) {
			fileName=multipartFile.getOriginalFilename();
				if(!fileName.isBlank()) {
					obj.setLanguage_certificate(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));
				}				
			}
	}
			language saveuser=language_services.create(obj);
			return new ResponseEntity<language>(saveuser,HttpStatus.CREATED);
	}
	
	@GetMapping(path = "")
	public ResponseEntity<List<language>> getAllperson() throws Exception
	{
		List<language> obj=language_services.getAllpersons();
		List<language> get=new ArrayList<>();
		
		 for (int i = 0; i < obj.size(); i++) {
			 language list=obj.get(i);
			 get.add(list);
				 if(list.getLanguage_certificate()!=null) {
					 list.setLanguage_certificate(java.util.Base64.getDecoder().decode(list.getLanguage_certificate()));
				 	}
			 }
		 return ResponseEntity.ok().body(get);
	}
	
	@GetMapping(path = "{id}")
	public ResponseEntity<language> findUserById(@PathVariable(value = "id") int id) {
		
    	language obj=language_services.findOne(id);
    	
    		if(obj.getLanguage_certificate()!=null) {
    			obj.setLanguage_certificate(java.util.Base64.getDecoder().decode(obj.getLanguage_certificate()));
    		}
	return ResponseEntity.ok().body(obj);
}
	
	@PutMapping(path = "{id}",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public String updateperson(@RequestPart("Data") String Datas, @RequestPart(name="files" ,required = false) MultipartFile[] files, @PathVariable int id) throws Exception
	{
		language obj=language_services.findOne(id);
		language get=this.mapper.readValue(Datas, language.class);
		
			get.setId(id);       
			String fileName=null;
			
			if(!(files==null)) {
			for (MultipartFile multipartFile : files)  {
			fileName=multipartFile.getOriginalFilename();
				if(!fileName.isBlank()) {
					get.setLanguage_certificate(java.util.Base64.getEncoder().encode(multipartFile.getBytes()));								
				}					
			}
			}
			language_services.create(get);
			return "updated successsfully";
	}

	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable(value = "id") int id) {
		language_services.deleteById(id);
		return "Deleted Success";
    }
//	@DeleteMapping("{id}")
//	public String deleteById(@PathVariable(value = "id") int id) {
//		language obj=language_services.findOne(id);
//		if(!language_services.findOne(id).equals(Optional.empty())) 
//		{
//			language_services.create(obj);
//			return "deleted successfully";
//		}
//		return "Id not valid";
//	}
}
