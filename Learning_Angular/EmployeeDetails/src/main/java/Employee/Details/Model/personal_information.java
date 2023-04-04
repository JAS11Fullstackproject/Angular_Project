package Employee.Details.Model;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class personal_information {

	

	
	

	public String getDrivinglicencename() {
		return drivinglicencename;
	}

	public void setDrivinglicencename(String drivinglicencename) {
		this.drivinglicencename = drivinglicencename;
	}

	public String getAadharname() {
		return aadharname;
	}

	public void setAadharname(String aadharname) {
		this.aadharname = aadharname;
	}

	public String getPassportname() {
		return passportname;
	}

	public void setPassportname(String passportname) {
		this.passportname = passportname;
	}

	public String getPassport_copy() {
		return passport_copy;
	}

	public void setPassport_copy(String passport_copy) {
		this.passport_copy = passport_copy;
	}

	public String getAadhar_copy() {
		return aadhar_copy;
	}

	public void setAadhar_copy(String aadhar_copy) {
		this.aadhar_copy = aadhar_copy;
	}

	public String getDriving_license_copy() {
		return driving_license_copy;
	}

	public void setDriving_license_copy(String driving_license_copy) {
		this.driving_license_copy = driving_license_copy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}

	public String getAlternate_no() {
		return alternate_no;
	}

	public void setAlternate_no(String alternate_no) {
		this.alternate_no = alternate_no;
	}

	public String getEmergency_no() {
		return emergency_no;
	}

	public void setEmergency_no(String emergency_no) {
		this.emergency_no = emergency_no;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getDriving_license() {
		return driving_license;
	}

	public void setDriving_license(String driving_license) {
		this.driving_license = driving_license;
	}

	public Long getPrevious_emp_id() {
		return previous_emp_id;
	}

	public void setPrevious_emp_id(Long previous_emp_id) {
		this.previous_emp_id = previous_emp_id;
	}

	public String getPrevious_employer_details() {
		return previous_employer_details;
	}

	public void setPrevious_employer_details(String previous_employer_details) {
		this.previous_employer_details = previous_employer_details;
	}

	public String getWork_location() {
		return work_location;
	}

	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getLanguage_known() {
		return language_known;
	}

	public void setLanguage_known(String language_known) {
		this.language_known = language_known;
	}

	public String getGithub_id() {
		return github_id;
	}

	public void setGithub_id(String github_id) {
		this.github_id = github_id;
	}

	public String getSocial_media() {
		return social_media;
	}

	public void setSocial_media(String social_media) {
		this.social_media = social_media;
	}

	public String getPhysically_challenge() {
		return physically_challenge;
	}

	public void setPhysically_challenge(String physically_challenge) {
		this.physically_challenge = physically_challenge;
	}

	public String getIdentification_marks() {
		return identification_marks;
	}

	public void setIdentification_marks(String identification_marks) {
		this.identification_marks = identification_marks;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	//@Pattern(regexp = "(^[a-zA-Z]{1,15}+$)",message="please enter characters only, within 15")
	//@NotEmpty(message = "first name should not be empty")
	private String first_name;
	
	private String middle_name;
	
	
	//@Pattern(regexp = "(^[a-zA-Z]{1,5}+$)",message="please enter characters only, within 5")
	//@NotEmpty(message = "last name should not be empty")
	private String last_name;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@Past(message = "Date input is invalid for a birth date.")
	//@NotEmpty(message = "Date of Birth should not be empty")
	private Date date_of_birth;
	
//	@NotEmpty(message = "age should not be empty")
//	@Min(value=1, message="age should be greater than 1")  
//    @Max(value=99, message="age should be less than 99")
	private String age;
	
	//@NotEmpty(message = "gender should not be empty")
	private String gender;
	
	
//	@Email(message = "must be email formate")
//	@NotEmpty(message = "email should not be empty")
	private String email;
	
//	@NotEmpty(message = "mobile number cannot be empty")
//	@Pattern(regexp = "(^$|[0-9]{10})",message ="Please enter a valid phone number")
	private String mobile_no;
	
	//@NotEmpty(message = "address should not be empty")
	private String address;
	
	//@NotEmpty(message = "city should not be empty")
	private String city;
	
	//@NotEmpty(message = "state should not be empty")
	private String state;
	
	//@NotEmpty(message = "country should not be empty")
	private String country;
	
//	@NotEmpty(message = "pin_code cannot be empty")
//	@Pattern(regexp ="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Please enter a valid pin_code")
	private String pin_code;
	
//	@NotEmpty(message = "alternate_number cannot be empty")
//	@Pattern(regexp = "(^$|[0-9]{10})",message ="Please enter a valid alternate_no")
	private String alternate_no;
	
	private String emergency_no;
	
//	@NotEmpty(message = "blood group should not be empty")
//	@Pattern(regexp = "(A|B|AB|O)[+-]", message = "Blood group not valid")
	private String blood_group;
	
	//@NotNull(message = "passport number should not be empty")
	private String passport_no;
	
	@Column(columnDefinition = "LONGTEXT")
	private String passport_copy;
	
//	@NotEmpty(message = "aadhar_no cannot be empty")
//	@Pattern(regexp = "(^$|[0-9]{12})",message ="Please enter a valid aadhar_no")
	private String aadhar_no;
	
	@Column(columnDefinition = "LONGTEXT")
	private String aadhar_copy;
	
	//@NotEmpty(message = "driving license should not be empty")
	private String driving_license;
	
	@Column(columnDefinition = "LONGText")
	private String driving_license_copy;
	
	private Long previous_emp_id;
	
	//@NotEmpty(message = "previous employer details should not be empty")
	private String previous_employer_details;
	
	//@NotEmpty(message = "work location should not be empty")
	private String work_location;
	
	//@NotEmpty(message = "marital status should not be empty")
	private String marital_status;
	
	//@NotEmpty(message = "language known should not be empty")
	private String language_known;
	
	//@NotEmpty(message = "github id should not be empty")
	private String github_id;
	
	//@NotEmpty(message = "social media should not be empty")
	private String social_media;
	
	//@NotEmpty(message = "physically challenge should not be empty")
	private String physically_challenge;
	
	//@NotEmpty(message = "identification marks should not be empty")
	private String identification_marks;
	
	private String passportname;
	
	private String aadharname;
	
	private String drivinglicencename;
	
	public personal_information(String passport_copy, String aadhar_copy, String driving_license_copy,
			String passportname, String aadharname, String drivinglicencename) {
		super();
		this.passport_copy = passport_copy;
		this.aadhar_copy = aadhar_copy;
		this.driving_license_copy = driving_license_copy;
		this.passportname = passportname;
		this.aadharname = aadharname;
		this.drivinglicencename = drivinglicencename;
	}

	//private String Status;
	

	
	
	public personal_information() {
		super();
		
	}

	public personal_information(int id, String first_name, String middle_name, String last_name, Date date_of_birth,
			String age, String gender, String email, String mobile_no, String address, String city, String state,
			String country, String pin_code, String alternate_no, String emergency_no, String blood_group,
			String passport_no, String aadhar_no, String driving_license, Long previous_emp_id,
			String previous_employer_details, String work_location, String marital_status, String language_known,
			String github_id, String social_media, String physically_challenge, String identification_marks) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobile_no = mobile_no;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin_code = pin_code;
		this.alternate_no = alternate_no;
		this.emergency_no = emergency_no;
		this.blood_group = blood_group;
		this.passport_no = passport_no;
		this.aadhar_no = aadhar_no;
		this.driving_license = driving_license;
		this.previous_emp_id = previous_emp_id;
		this.previous_employer_details = previous_employer_details;
		this.work_location = work_location;
		this.marital_status = marital_status;
		this.language_known = language_known;
		this.github_id = github_id;
		this.social_media = social_media;
		this.physically_challenge = physically_challenge;
		this.identification_marks = identification_marks;
	}

	
	
}
