package Employee.Details.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Accomodation {

	
	 public String getAccommodationGivenByCompany() {
		return accommodationGivenByCompany;
	}

	public void setAccommodationGivenByCompany(String accommodationGivenByCompany) {
		this.accommodationGivenByCompany = accommodationGivenByCompany;
	}

	public Long getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(Long accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getCompletePostalAddress() {
		return completePostalAddress;
	}

	public void setCompletePostalAddress(String completePostalAddress) {
		this.completePostalAddress = completePostalAddress;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getShiftedOn() {
		return shiftedOn;
	}

	public void setShiftedOn(String shiftedOn) {
		this.shiftedOn = shiftedOn;
	}

	public String getRelievedOn() {
		return relievedOn;
	}

	public void setRelievedOn(String relievedOn) {
		this.relievedOn = relievedOn;
	}

	public String getDurationOfTime() {
		return durationOfTime;
	}

	public void setDurationOfTime(String durationOfTime) {
		this.durationOfTime = durationOfTime;
	}

	public String getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(String monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public String getMiscellaneousChargesIfAny() {
		return miscellaneousChargesIfAny;
	}

	public void setMiscellaneousChargesIfAny(String miscellaneousChargesIfAny) {
		this.miscellaneousChargesIfAny = miscellaneousChargesIfAny;
	}

	public String getAnyIssueIf() {
		return anyIssueIf;
	}

	public void setAnyIssueIf(String anyIssueIf) {
		this.anyIssueIf = anyIssueIf;
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long accommodationId;
	 
	// @NotEmpty(message = "accommodationGivenByCompany should not be empty")
	    private String accommodationGivenByCompany;
	    
	 //@NotEmpty(message = "flatNo should not be empty")
	    private String flatNo;
	    
	 //@NotEmpty(message = "completePostalAddress should not be empty")
	    private String completePostalAddress;
	    
	// @NotEmpty(message = "contactDetails should not be empty")
	    private String contactDetails;
	    
	// @NotEmpty(message = "shiftedOn should not be empty")
	    private String shiftedOn;
	    
	// @NotEmpty(message = "relievedOn should not be empty")
	    private String relievedOn;
	    
	// @NotEmpty(message = "durationOfTime should not be empty")
	    private String durationOfTime;
	    
	// @NotEmpty(message = "monthlyRent should not be empty")
	    private String monthlyRent;
	    
	 //@NotEmpty(message = "miscellaneousChargesIfAny should not be empty")
	    private String miscellaneousChargesIfAny;
	    
	 //@NotEmpty(message = "anyIssueIf should not be empty")
	    private String anyIssueIf;

	public Accomodation(Long accommodationId,
			@NotEmpty(message = "accommodationGivenByCompany should not be empty") String accommodationGivenByCompany,
			@NotEmpty(message = "flatNo should not be empty") String flatNo,
			@NotEmpty(message = "completePostalAddress should not be empty") String completePostalAddress,
			@NotEmpty(message = "contactDetails should not be empty") String contactDetails,
			@NotEmpty(message = "shiftedOn should not be empty") String shiftedOn,
			@NotEmpty(message = "relievedOn should not be empty") String relievedOn,
			@NotEmpty(message = "durationOfTime should not be empty") String durationOfTime,
			@NotEmpty(message = "monthlyRent should not be empty") String monthlyRent,
			@NotEmpty(message = "miscellaneousChargesIfAny should not be empty") String miscellaneousChargesIfAny,
			@NotEmpty(message = "anyIssueIf should not be empty") String anyIssueIf) {
		super();
		this.accommodationId = accommodationId;
		this.accommodationGivenByCompany = accommodationGivenByCompany;
		this.flatNo = flatNo;
		this.completePostalAddress = completePostalAddress;
		this.contactDetails = contactDetails;
		this.shiftedOn = shiftedOn;
		this.relievedOn = relievedOn;
		this.durationOfTime = durationOfTime;
		this.monthlyRent = monthlyRent;
		this.miscellaneousChargesIfAny = miscellaneousChargesIfAny;
		this.anyIssueIf = anyIssueIf;
	}

	public Accomodation() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
