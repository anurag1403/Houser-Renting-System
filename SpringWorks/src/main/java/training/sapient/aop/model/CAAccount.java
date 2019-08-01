package training.sapient.aop.model;

public class CAAccount {
	private Account account;

	public CAAccount() {}
	public CAAccount(Account account) {
		super();
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "CAAcount [account=" + account + "]";
	}
	
}
