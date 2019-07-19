package training.day3;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try{
			System.out.println("Open connection");
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("Result of division is " + (num1/num2));
			try {
				int[] arr = new int[-4];
			} catch (NegativeArraySizeException e) {
				e.printStackTrace();
			}
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Close connection");			
		}
		System.out.println("This is some other logic");
	}
}
