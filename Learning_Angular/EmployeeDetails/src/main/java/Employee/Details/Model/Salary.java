package Employee.Details.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Salary {

	public long getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
	}

	public String getTotolCTC() {
		return totolCTC;
	}

	public void setTotolCTC(String totolCTC) {
		this.totolCTC = totolCTC;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getiFSCCode() {
		return iFSCCode;
	}

	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long salaryId;
	
	//@NotEmpty(message = "totolCTC should not be empty")
	private String totolCTC;
	
	//@NotEmpty(message = "bankName should not be empty")
	private String bankName;
	
	//@NotEmpty(message = "bankAddress should not be empty")
	private String bankAddress;
	
	//@NotEmpty(message = "accountNo should not be empty")
	private String accountNo;
	
	//@NotEmpty(message = "iFSCCode should not be empty")
	private String iFSCCode;

	public Salary(long salaryId, @NotEmpty(message = "totolCTC should not be empty") String totolCTC,
			@NotEmpty(message = "bankName should not be empty") String bankName,
			@NotEmpty(message = "bankAddress should not be empty") String bankAddress,
			@NotEmpty(message = "accountNo should not be empty") String accountNo,
			@NotEmpty(message = "iFSCCode should not be empty") String iFSCCode) {
		super();
		this.salaryId = salaryId;
		this.totolCTC = totolCTC;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.accountNo = accountNo;
		this.iFSCCode = iFSCCode;
	}

	public Salary() {
		super();
	}
	
	
}
