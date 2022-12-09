package exceptions;

public class sheet2 {
	public static void division(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("exception occured");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("result is : " + res);
		}
		System.out.println("remaining code ");
	}

	public static void main(String[] args) {
		sheet2.division(5, 7);

	}
}
