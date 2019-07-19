package training.day3;

public class SynchronizeTest extends Thread {
	
	Account account;
	int amount;
	
	public SynchronizeTest(Account account, int withDrawAmount, String name) {
	
		this.account = account;
		this.amount = withDrawAmount;
		new Thread(this, name).start();
	}
	public void run() {
		
		synchronized (account) {
			account.withDraw(amount);
		}
	}

	public static void main(String[] args) {
		Account account = new Account(1000);
		//two thread does the transaction
		new SynchronizeTest(account, 500, "A");
		new SynchronizeTest(account, 750, "B");
	}

}
