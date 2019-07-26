package Information;

import java.io.Serializable;

public class OwnerInformation extends PersonalInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bankAccountNo;
	private String bankBranch;
	//private String id;
	public OwnerInformation() {
	}
	public OwnerInformation(String name, String emailId, String address, String phoneNo, String bankBranch, String bankAccountNo){
		setName(name);
		setEmailId(emailId);
		setAddress(address);
		//setId(id);
		setPhoneNo(phoneNo);
		setBankBranch(bankBranch);
		setBankAccountNo(bankAccountNo);
	}
	/*private void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}*/
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
	public void termsAndConditions() {
		System.out.println("Provide your terms and conditions here");
	}
}
