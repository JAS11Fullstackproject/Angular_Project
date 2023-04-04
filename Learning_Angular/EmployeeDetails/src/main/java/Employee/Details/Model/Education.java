package Employee.Details.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Education {
	
	public String getTwelfthStandard() {
		return twelfthStandard;
	}
	public void setTwelfthStandard(String twelfthStandard) {
		this.twelfthStandard = twelfthStandard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGraduation_Degree_name() {
		return graduation_Degree_name;
	}
	public void setGraduation_Degree_name(String graduation_Degree_name) {
		this.graduation_Degree_name = graduation_Degree_name;
	}
	public String getGraduation_university_name() {
		return graduation_university_name;
	}
	public void setGraduation_university_name(String graduation_university_name) {
		this.graduation_university_name = graduation_university_name;
	}
	public String getGraduation_college_name() {
		return graduation_college_name;
	}
	public void setGraduation_college_name(String graduation_college_name) {
		this.graduation_college_name = graduation_college_name;
	}
	public String getGradaution_passing_year() {
		return gradaution_passing_year;
	}
	public void setGradaution_passing_year(String gradaution_passing_year) {
		this.gradaution_passing_year = gradaution_passing_year;
	}
	public String getGraduation_backLogs() {
		return graduation_backLogs;
	}
	public void setGraduation_backLogs(String graduation_backLogs) {
		this.graduation_backLogs = graduation_backLogs;
	}
	public String getGraduation_backlogs_clearedIf() {
		return graduation_backlogs_clearedIf;
	}
	public void setGraduation_backlogs_clearedIf(String graduation_backlogs_clearedIf) {
		this.graduation_backlogs_clearedIf = graduation_backlogs_clearedIf;
	}
	public String getGraduation_CGPA() {
		return graduation_CGPA;
	}
	public void setGraduation_CGPA(String graduation_CGPA) {
		this.graduation_CGPA = graduation_CGPA;
	}
	public String getEducationgap() {
		return educationgap;
	}
	public void setEducationgap(String educationgap) {
		this.educationgap = educationgap;
	}
	public String getEducation_gap_duration() {
		return education_gap_duration;
	}
	public void setEducation_gap_duration(String education_gap_duration) {
		this.education_gap_duration = education_gap_duration;
	}
	public String getPost_graduation_degree() {
		return post_graduation_degree;
	}
	public void setPost_graduation_degree(String post_graduation_degree) {
		this.post_graduation_degree = post_graduation_degree;
	}
	public String getPost_graduation_degreeName() {
		return post_graduation_degreeName;
	}
	public void setPost_graduation_degreeName(String post_graduation_degreeName) {
		this.post_graduation_degreeName = post_graduation_degreeName;
	}
	public String getPost_graduation_university_name() {
		return post_graduation_university_name;
	}
	public void setPost_graduation_university_name(String post_graduation_university_name) {
		this.post_graduation_university_name = post_graduation_university_name;
	}
	public String getPost_graduation_college_name() {
		return post_graduation_college_name;
	}
	public void setPost_graduation_college_name(String post_graduation_college_name) {
		this.post_graduation_college_name = post_graduation_college_name;
	}
	public String getPost_graduation_passing_year() {
		return post_graduation_passing_year;
	}
	public void setPost_graduation_passing_year(String post_graduation_passing_year) {
		this.post_graduation_passing_year = post_graduation_passing_year;
	}
	public String getPost_graduation_backlogs() {
		return post_graduation_backlogs;
	}
	public void setPost_graduation_backlogs(String post_graduation_backlogs) {
		this.post_graduation_backlogs = post_graduation_backlogs;
	}
	public String getPost_graduation_backLogs_clearedIf() {
		return post_graduation_backLogs_clearedIf;
	}
	public void setPost_graduation_backLogs_clearedIf(String post_graduation_backLogs_clearedIf) {
		this.post_graduation_backLogs_clearedIf = post_graduation_backLogs_clearedIf;
	}
	public String getPost_graduation_CGPA() {
		return post_graduation_CGPA;
	}
	public void setPost_graduation_CGPA(String post_graduation_CGPA) {
		this.post_graduation_CGPA = post_graduation_CGPA;
	}
	public String getPost_graduat_educationgap() {
		return post_graduat_educationgap;
	}
	public void setPost_graduat_educationgap(String post_graduat_educationgap) {
		this.post_graduat_educationgap = post_graduat_educationgap;
	}
	public String getPost_graduat_education_gap_duration() {
		return post_graduat_education_gap_duration;
	}
	public void setPost_graduat_education_gap_duration(String post_graduat_education_gap_duration) {
		this.post_graduat_education_gap_duration = post_graduat_education_gap_duration;
	}
	public String getTwelfth_standard_school_name() {
		return twelfth_standard_school_name;
	}
	public void setTwelfth_standard_school_name(String twelfth_standard_school_name) {
		this.twelfth_standard_school_name = twelfth_standard_school_name;
	}
	public String getTwelfth_standard_board_name() {
		return twelfth_standard_board_name;
	}
	public void setTwelfth_standard_board_name(String twelfth_standard_board_name) {
		this.twelfth_standard_board_name = twelfth_standard_board_name;
	}
	public String getTwelfth_standard_passingyear() {
		return twelfth_standard_passingyear;
	}
	public void setTwelfth_standard_passingyear(String twelfth_standard_passingyear) {
		this.twelfth_standard_passingyear = twelfth_standard_passingyear;
	}
	public String getTwelfth_standard_CGPA_Percentage() {
		return twelfth_standard_CGPA_Percentage;
	}
	public void setTwelfth_standard_CGPA_Percentage(String twelfth_standard_CGPA_Percentage) {
		this.twelfth_standard_CGPA_Percentage = twelfth_standard_CGPA_Percentage;
	}
	public String getTenth_standard() {
		return tenth_standard;
	}
	public void setTenth_standard(String tenth_standard) {
		this.tenth_standard = tenth_standard;
	}
	public String getTenth_standard_school_name() {
		return tenth_standard_school_name;
	}
	public void setTenth_standard_school_name(String tenth_standard_school_name) {
		this.tenth_standard_school_name = tenth_standard_school_name;
	}
	public String getTenth_standard_board_name() {
		return tenth_standard_board_name;
	}
	public void setTenth_standard_board_name(String tenth_standard_board_name) {
		this.tenth_standard_board_name = tenth_standard_board_name;
	}
	public String getTenth_standard_passingyear() {
		return tenth_standard_passingyear;
	}
	public void setTenth_standard_passingyear(String tenth_standard_passingyear) {
		this.tenth_standard_passingyear = tenth_standard_passingyear;
	}
	public String getTenth_standard_CGPA_Percentage() {
		return tenth_standard_CGPA_Percentage;
	}
	public void setTenth_standard_CGPA_Percentage(String tenth_standard_CGPA_Percentage) {
		this.tenth_standard_CGPA_Percentage = tenth_standard_CGPA_Percentage;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String graduation_Degree_name;
	private String graduation_university_name;
	private String graduation_college_name;
	private String gradaution_passing_year;
	private String graduation_backLogs;
	private String graduation_backlogs_clearedIf;
	private String graduation_CGPA;
	private String educationgap;
	private String education_gap_duration;
	private String post_graduation_degree;
	private String post_graduation_degreeName;
	private String post_graduation_university_name;
	private String post_graduation_college_name;
	private String post_graduation_passing_year;
	private String post_graduation_backlogs;
	private String post_graduation_backLogs_clearedIf;
	private String post_graduation_CGPA;
	private String post_graduat_educationgap;
	private String post_graduat_education_gap_duration;
	private String twelfthStandard;
	private String twelfth_standard_school_name;
	private String twelfth_standard_board_name;
	private String twelfth_standard_passingyear;
	private String twelfth_standard_CGPA_Percentage;
	private String tenth_standard;
	private String tenth_standard_school_name;
	private String tenth_standard_board_name;
	private String tenth_standard_passingyear;
	private String tenth_standard_CGPA_Percentage;
	public Education(int id, String graduation_Degree_name, String graduation_university_name,
			String graduation_college_name, String gradaution_passing_year, String graduation_backLogs,
			String graduation_backlogs_clearedIf, String graduation_CGPA, String educationgap,
			String education_gap_duration, String post_graduation_degree, String post_graduation_degreeName,
			String post_graduation_university_name, String post_graduation_college_name,
			String post_graduation_passing_year, String post_graduation_backlogs,
			String post_graduation_backLogs_clearedIf, String post_graduation_CGPA, String post_graduat_educationgap,
			String post_graduat_education_gap_duration, String twelfth_standard_school_name,
			String twelfth_standard_board_name, String twelfth_standard_passingyear,
			String twelfth_standard_CGPA_Percentage, String tenth_standard, String tenth_standard_school_name,
			String tenth_standard_board_name, String tenth_standard_passingyear,
			String tenth_standard_CGPA_Percentage) {
		super();
		this.id = id;
		this.graduation_Degree_name = graduation_Degree_name;
		this.graduation_university_name = graduation_university_name;
		this.graduation_college_name = graduation_college_name;
		this.gradaution_passing_year = gradaution_passing_year;
		this.graduation_backLogs = graduation_backLogs;
		this.graduation_backlogs_clearedIf = graduation_backlogs_clearedIf;
		this.graduation_CGPA = graduation_CGPA;
		this.educationgap = educationgap;
		this.education_gap_duration = education_gap_duration;
		this.post_graduation_degree = post_graduation_degree;
		this.post_graduation_degreeName = post_graduation_degreeName;
		this.post_graduation_university_name = post_graduation_university_name;
		this.post_graduation_college_name = post_graduation_college_name;
		this.post_graduation_passing_year = post_graduation_passing_year;
		this.post_graduation_backlogs = post_graduation_backlogs;
		this.post_graduation_backLogs_clearedIf = post_graduation_backLogs_clearedIf;
		this.post_graduation_CGPA = post_graduation_CGPA;
		this.post_graduat_educationgap = post_graduat_educationgap;
		this.post_graduat_education_gap_duration = post_graduat_education_gap_duration;
		this.twelfth_standard_school_name = twelfth_standard_school_name;
		this.twelfth_standard_board_name = twelfth_standard_board_name;
		this.twelfth_standard_passingyear = twelfth_standard_passingyear;
		this.twelfth_standard_CGPA_Percentage = twelfth_standard_CGPA_Percentage;
		this.tenth_standard = tenth_standard;
		this.tenth_standard_school_name = tenth_standard_school_name;
		this.tenth_standard_board_name = tenth_standard_board_name;
		this.tenth_standard_passingyear = tenth_standard_passingyear;
		this.tenth_standard_CGPA_Percentage = tenth_standard_CGPA_Percentage;
	}
	
	public Education(String twelfthStandard) {
		super();
		this.twelfthStandard = twelfthStandard;
	}
	public Education() {
		super();
	}
	
	
	
}
