package Employee.Details.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workexperience {
	
	

	public long getWorkexperienceId() {
		return workexperienceId;
	}





	public void setWorkexperienceId(long workexperienceId) {
		this.workexperienceId = workexperienceId;
	}





	public String getTotalWorkExperience() {
		return totalWorkExperience;
	}





	public void setTotalWorkExperience(String totalWorkExperience) {
		this.totalWorkExperience = totalWorkExperience;
	}





	public Integer getTotalEmployerCounts() {
		return totalEmployerCounts;
	}





	public void setTotalEmployerCounts(Integer totalEmployerCounts) {
		this.totalEmployerCounts = totalEmployerCounts;
	}





	public String getEmployerDetails() {
		return employerDetails;
	}





	public void setEmployerDetails(String employerDetails) {
		this.employerDetails = employerDetails;
	}





	public String getEmployeeId() {
		return employeeId;
	}





	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}





	public String getJobTitle() {
		return jobTitle;
	}





	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}





	public String getDatesOfEmployement() {
		return datesOfEmployement;
	}





	public void setDatesOfEmployement(String datesOfEmployement) {
		this.datesOfEmployement = datesOfEmployement;
	}





	public String getListOfResponsibilities() {
		return listOfResponsibilities;
	}





	public void setListOfResponsibilities(String listOfResponsibilities) {
		this.listOfResponsibilities = listOfResponsibilities;
	}





	public String getListOfAwardsOrRecognitions() {
		return listOfAwardsOrRecognitions;
	}





	public void setListOfAwardsOrRecognitions(String listOfAwardsOrRecognitions) {
		this.listOfAwardsOrRecognitions = listOfAwardsOrRecognitions;
	}





	public String getJobLocation() {
		return jobLocation;
	}





	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long workexperienceId;
	

	private String totalWorkExperience;
	
	
	private Integer totalEmployerCounts;
	
	//@NotEmpty(message = "employerDetails cannot be empty")
	private String employerDetails;
	
	//@NotEmpty(message = "employeeId cannot be empty")
	private String employeeId;
	
	//@NotEmpty(message = "jobTitle cannot be empty")
	private String jobTitle;
	
	//@NotEmpty(message = "datesOfEmployement cannot be empty")
	private String datesOfEmployement;
	
	//@NotEmpty(message = "listOfResponsibilities cannot be empty")
	private String listOfResponsibilities;
	
	//@NotEmpty(message = "listOfAwardsOrRecognitions cannot be empty")
	private String listOfAwardsOrRecognitions;
	
	//@NotEmpty(message = "jobLocation cannot be empty")
	private String jobLocation;

	
	
	

	public Workexperience(long workexperienceId, String totalWorkExperience, Integer totalEmployerCounts,
			String employerDetails, String employeeId, String jobTitle, String datesOfEmployement,
			String listOfResponsibilities, String listOfAwardsOrRecognitions, String jobLocation) {
		super();
		this.workexperienceId = workexperienceId;
		this.totalWorkExperience = totalWorkExperience;
		this.totalEmployerCounts = totalEmployerCounts;
		this.employerDetails = employerDetails;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.datesOfEmployement = datesOfEmployement;
		this.listOfResponsibilities = listOfResponsibilities;
		this.listOfAwardsOrRecognitions = listOfAwardsOrRecognitions;
		this.jobLocation = jobLocation;
	}





	public Workexperience() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
