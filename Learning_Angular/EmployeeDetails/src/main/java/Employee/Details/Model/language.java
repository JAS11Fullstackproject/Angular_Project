package Employee.Details.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class language {
	
	public String getCertificate_available() {
		return certificate_available;
	}





	public void setCertificate_available(String certificate_available) {
		this.certificate_available = certificate_available;
	}





	public String getOption4() {
		return option4;
	}





	public void setOption4(String option4) {
		this.option4 = option4;
	}





	public String getRead4() {
		return read4;
	}





	public void setRead4(String read4) {
		this.read4 = read4;
	}





	public String getWrite4() {
		return write4;
	}





	public void setWrite4(String write4) {
		this.write4 = write4;
	}





	public String getSpeak4() {
		return speak4;
	}





	public void setSpeak4(String speak4) {
		this.speak4 = speak4;
	}





	public String getCertificate_name() {
		return certificate_name;
	}





	public void setCertificate_name(String certificate_name) {
		this.certificate_name = certificate_name;
	}





	public byte[] getLanguage_certificate() {
		return language_certificate;
	}





	public void setLanguage_certificate(byte[] language_certificate) {
		this.language_certificate = language_certificate;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getOption1() {
		return option1;
	}





	public void setOption1(String option1) {
		this.option1 = option1;
	}





	public String getOption2() {
		return option2;
	}





	public void setOption2(String option2) {
		this.option2 = option2;
	}





	public String getOption3() {
		return option3;
	}





	public void setOption3(String option3) {
		this.option3 = option3;
	}





	public String getRead1() {
		return read1;
	}





	public void setRead1(String read1) {
		this.read1 = read1;
	}





	public String getWrite1() {
		return write1;
	}





	public void setWrite1(String write1) {
		this.write1 = write1;
	}





	public String getSpeak1() {
		return speak1;
	}





	public void setSpeak1(String speak1) {
		this.speak1 = speak1;
	}





	public String getRead2() {
		return read2;
	}





	public void setRead2(String read2) {
		this.read2 = read2;
	}





	public String getWrite2() {
		return write2;
	}





	public void setWrite2(String write2) {
		this.write2 = write2;
	}





	public String getSpeak2() {
		return speak2;
	}





	public void setSpeak2(String speak2) {
		this.speak2 = speak2;
	}





	public String getRead3() {
		return read3;
	}





	public void setRead3(String read3) {
		this.read3 = read3;
	}





	public String getWrite3() {
		return write3;
	}





	public void setWrite3(String write3) {
		this.write3 = write3;
	}





	public String getSpeak3() {
		return speak3;
	}





	public void setSpeak3(String speak3) {
		this.speak3 = speak3;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String option1;
	
	private String option2;
	
	private String option3;
	
	private String option4;
	
	private String read1;
	
	private String write1;
	
	private String speak1;
	
	private String read2;
	
	private String write2;
	
	private String speak2;
	
	private String read3;
	
	private String write3;
	
	private String speak3;
	
	private String read4;
	
	private String write4;
	
	private String speak4;
	
	private String certificate_name;
	
	private String certificate_available;
	
	@Column(columnDefinition = "LONGBLOB")
	private byte[] language_certificate;






	public language(String option4, String read4, String write4, String speak4, String certificate_available) {
		super();
		this.option4 = option4;
		this.read4 = read4;
		this.write4 = write4;
		this.speak4 = speak4;
		this.certificate_available = certificate_available;
	}





	public language(String certificate_name) {
		super();
		this.certificate_name = certificate_name;
	}





	public language(byte[] language_certificate) {
		super();
		this.language_certificate = language_certificate;
	}

	public language(int id, String option1, String option2, String option3, String read1, String write1, String speak1,
			String read2, String write2, String speak2, String read3, String write3, String speak3) {
		super();
		this.id = id;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.read1 = read1;
		this.write1 = write1;
		this.speak1 = speak1;
		this.read2 = read2;
		this.write2 = write2;
		this.speak2 = speak2;
		this.read3 = read3;
		this.write3 = write3;
		this.speak3 = speak3;
	}





	public language() {
		super();
	}
	
	

}
