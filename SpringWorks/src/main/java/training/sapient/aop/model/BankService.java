package training.sapient.aop.model;

public class BankService {
	private SBAccount sbAccount;
	private CAAccount caAccount;
	public BankService() {}
	public BankService(SBAccount sbAccount, CAAccount caAccount) {
		super();
		this.sbAccount = sbAccount;
		this.caAccount = caAccount;
	}
	public SBAccount getSbAccount() {
		return sbAccount;
	}
	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}
	public CAAccount getCaAccount() {
		return caAccount;
	}
	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}
	@Override
	public String toString() {
		return "BankService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	}
	
}
