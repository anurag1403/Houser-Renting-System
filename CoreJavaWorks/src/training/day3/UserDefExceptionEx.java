package training.day3;

class Customer{
	private String customerName;
	private String email;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class UserDefExceptionEx {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("anurag");
		customer.setEmail("abc@xyz.com");
		int amount = 99;
		try {
			performTransaction(customer, amount);
		} catch (NameTooSmallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(AmountTooSmallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void performTransaction(Customer customer, int amount) throws Exception {
		try {
			checkName(customer);
			checkAmount(amount);
		} catch (NameTooSmallException e) {
			throw new Exception("Sorry it wasn't performed", e);
		} catch(AmountTooSmallException e) {
			throw new Exception("Sorry it wasn't performed", e);
		}
		
	}
	
	public static void checkName(Customer customer) throws NameTooSmallException {
		if(customer.getCustomerName().length() < 3) {
			throw new NameTooSmallException("Sorry Transaction cannot be performed as " +customer.getCustomerName() +  "is too short");
		}
	}
	public static void checkAmount(int amount) throws AmountTooSmallException {
		if(amount < 100) {
			throw new AmountTooSmallException("Sorry Transaction cannot be performed as " + amount + " is too small!");
		}
		else {
			System.out.println("Transaction successful!");
		}
	}
}
