package exceptions;

class NegetivePriceException extends Exception {
	public NegetivePriceException() {
		super("Negetive Price!!");
	}
}

class InvalidPriceException extends Exception {
	public InvalidPriceException() {
		super("Invalid Price!!");
	}
}

class Calc {
	public static void validate(int Sprice, int Cprice) throws InvalidPriceException, NegetivePriceException {
		if (Sprice < 0 || Cprice < 0) {
			throw new NegetivePriceException();
			// we cant use return keyword after throw keyword use
		}
		if (Sprice > Cprice)
			System.out.println("Profit!!");
		else if (Sprice == Cprice)
			throw new InvalidPriceException();
		else
			System.out.println("loss");

	}
}

public class sheet5 {

	public static void main(String[] args) {
		try {
			Calc.validate(200, 100);
		} catch (InvalidPriceException e) {
			System.out.println("message: " + e.getMessage());
		} catch (NegetivePriceException e) {
			System.out.println("message: " + e.getMessage());
		} finally {
			System.out.println("remaining code");
		}
	}
}