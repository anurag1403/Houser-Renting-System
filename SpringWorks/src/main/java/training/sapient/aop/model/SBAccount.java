package training.sapient.aop.model;

public class SBAccount {
	private Account account;
	
	public SBAccount(){}	
	@Override
	public String toString() {
		return "SBAccount [account=" + account + "]";
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public SBAccount(Account account) {
		super();
		this.account = account;
	}


	public double showBalance() {
		return this.account.getBalance();
	}
}
