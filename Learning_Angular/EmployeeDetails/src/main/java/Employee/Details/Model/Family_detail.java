package Employee.Details.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
public class Family_detail {

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFather_name() {
		return father_name;
	}



	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}



	public String getFather_occupation() {
		return father_occupation;
	}



	public void setFather_occupation(String father_occupation) {
		this.father_occupation = father_occupation;
	}



	public String getFather_contact() {
		return father_contact;
	}



	public void setFather_contact(String father_contact) {
		this.father_contact = father_contact;
	}



	public String getMother_name() {
		return mother_name;
	}



	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}



	public String getMother_occupation() {
		return mother_occupation;
	}



	public void setMother_occupation(String mother_occupation) {
		this.mother_occupation = mother_occupation;
	}



	public String getMother_contact() {
		return mother_contact;
	}



	public void setMother_contact(String mother_contact) {
		this.mother_contact = mother_contact;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@NotEmpty(message = "Father Name should not be empty")
	private String father_name;
	
	//@NotEmpty(message = "Father Occupation should not be empty")
	private String father_occupation;
	
//	@NotEmpty(message = "Father Contact should not be empty")
//	@Pattern(regexp = "(^$|[0-9]{10})",message ="Please enter a valid phone number")
	private String father_contact;
	
	//@NotEmpty(message = "Mother Name should not be empty")
	private String mother_name;
	
	//@NotEmpty(message = "Mother's Occupation should not be empty")
	private String mother_occupation;
	
//	@NotEmpty(message = "Mother Contact should not be empty")
//	@Pattern(regexp = "(^$|[0-9]{10})",message ="Please enter a valid phone number")
	private String mother_contact;

	
	
	public Family_detail(int id, @NotEmpty(message = "Father Name should not be empty") String father_name,
			@NotEmpty(message = "Father Occupation should not be empty") String father_occupation,
			@NotEmpty(message = "Father Contact should not be empty") @Pattern(regexp = "(^$|[0-9]{10})", message = "Please enter a valid phone number") String father_contact,
			@NotEmpty(message = "Mother Name should not be empty") String mother_name,
			@NotEmpty(message = "Mother's Occupation should not be empty") String mother_occupation,
			@NotEmpty(message = "Mother Contact should not be empty") String mother_contact) {
		super();
		this.id = id;
		this.father_name = father_name;
		this.father_occupation = father_occupation;
		this.father_contact = father_contact;
		this.mother_name = mother_name;
		this.mother_occupation = mother_occupation;
		this.mother_contact = mother_contact;
	}



	public Family_detail() {
		super();
	}
	
	
}
