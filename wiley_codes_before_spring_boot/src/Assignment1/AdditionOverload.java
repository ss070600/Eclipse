package Assignment1;

public class AdditionOverload {

	public static double addTwo(double a, double b) {
		return a + b;
	}

	public static double addThree(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 5, b = 7, c = 10;
		System.out.println("addTwo() : " + addTwo(a, b));
		System.out.println("addThree() : " + addThree(a, b, c));
	}

}
