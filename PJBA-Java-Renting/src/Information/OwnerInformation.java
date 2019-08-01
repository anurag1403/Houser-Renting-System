package Information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class OwnerInformation{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int owner_id;
	private String name;
	@Column(name = "email")
	private String emailId;
	private String address;
	@Column(name = "phone_no")
	private String phoneNo;
	@Column(name = "bank_account_no")
	private String bankAccountNo;
	@Column(name = "bank_branch")
	private String bankBranch;
	@OneToOne
	@JoinColumn(name = "username")
	private Credentials credentials;
	//private String id;
	public OwnerInformation() {
	}
	public OwnerInformation(int id, String name, String emailId, String address, String phoneNo, String bankAccountNo,
			String bankBranch, Credentials credentials) {
		super();
		this.owner_id = id;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.bankAccountNo = bankAccountNo;
		this.bankBranch = bankBranch;
		this.credentials = credentials;
	}
	public int getId() {
		return owner_id;
	}
	public void setId(int id) {
		this.owner_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}	
	
}
