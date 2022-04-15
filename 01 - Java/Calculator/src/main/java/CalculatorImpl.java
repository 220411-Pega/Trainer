import java.util.InputMismatchException;

public class CalculatorImpl implements Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int modulo(int a, int b) {
		return a % b;
	}

	public int calculate(String query) throws InputMismatchException {
		
		String[] parts = query.split(" ");
		int a = 0, b = 0;
		
		try {
			a = Integer.parseInt(parts[0]);
		} catch (Exception e) {
			System.out.println("Invalid first number!");
			throw e;
		}
		
		try {
			b = Integer.parseInt(parts[2]);
		} catch (Exception e) {
			System.out.println("Invalid second number!");
			throw e;
		}
		
		switch (parts[1]) {
		case "+":
			return add(a, b);
			
		case "-":
			return subtract(a, b);
			
		case "*":
			return multiply(a, b);
			
		case "/":
			return divide(a, b);
			
		case "%":
			return modulo(a, b);
			
		default:
			throw new InputMismatchException("No valid operator found!");
		}
	}

}
