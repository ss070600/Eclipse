package exceptions;

public class sheet4 {
	public static void division(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("exception occured");
			System.out.println(ex.getMessage());
		} catch (Exception ex) {// Exception is superclass of all Exceptions so it must be in the last catch
								// block only otherwise it will give compiler error.
			System.out.println("exception occured");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("result is : " + res);
		}
		System.out.println("remaining code ");
	}

	public static void main(String[] args) {
		sheet4.division(5, 7);

	}
}
