package training.day3;

public class AmountTooSmallException extends Exception {
	private String message;

	public AmountTooSmallException() {
		this.message = "Sorry amount is too small!";
	}
	public AmountTooSmallException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
	@Override
	public String toString() {
		return "[ " + this.message;
	}

}
