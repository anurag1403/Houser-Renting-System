package training.lambda;

public class MathOperationImpl {
	public static void main(String[] args) {
		//templates
		MathOperation add = (num1, num2) -> num1 + num2;
		MathOperation sub = (num1, num2) -> num1 - num2;
		MathOperation mul = (num1, num2) -> num1 * num2;
		MathOperation div = (num1, num2) -> num1 / num2;
		int num1 = 30;
		int num2 = 10;
		System.out.println("Addition of two numbers is " + operate(num1, num2, add));
		System.out.println("Substraction of two numbers is " + operate(num1, num2, sub));
		System.out.println("Multiplication of two numbers is " + operate(num1, num2, mul));
		System.out.println("Division of two numbers is " + operate(num1, num2, div));
	}
	
	public static int operate(int num1, int num2, MathOperation operation) {
		return operation.operation(num1, num2);
	}
 }
