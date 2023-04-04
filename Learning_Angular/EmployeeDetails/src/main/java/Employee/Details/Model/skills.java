package Employee.Details.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class skills {



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSoft_skills() {
		return soft_skills;
	}



	public void setSoft_skills(String soft_skills) {
		this.soft_skills = soft_skills;
	}



	public String getProficiency_in_said_soft_skills() {
		return proficiency_in_said_soft_skills;
	}



	public void setProficiency_in_said_soft_skills(String proficiency_in_said_soft_skills) {
		this.proficiency_in_said_soft_skills = proficiency_in_said_soft_skills;
	}



	public String getTechnical_skills() {
		return technical_skills;
	}



	public void setTechnical_skills(String technical_skills) {
		this.technical_skills = technical_skills;
	}



	public String getProficiency_in_said_technical_skills() {
		return proficiency_in_said_technical_skills;
	}



	public void setProficiency_in_said_technical_skills(String proficiency_in_said_technical_skills) {
		this.proficiency_in_said_technical_skills = proficiency_in_said_technical_skills;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@NotEmpty(message = "Soft skill should not be empty")
	private String soft_skills;
	
	//@NotEmpty(message = "Proficiency In said Soft Skills should not be empty")
	private String proficiency_in_said_soft_skills;
	
	//@NotEmpty(message = "Technical_Skills should not be empty")
	private String technical_skills;
	
	//@NotEmpty(message = "Proficiency_In_said_Technical_Skills should not be empty")
	private String proficiency_in_said_technical_skills;
	
	

	public skills() {
		super();
	}
}
