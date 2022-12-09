package exceptions;

public class sheet3 {
	public static void division(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("exception occured");
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception occured");
			System.out.println(e.getMessage());
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
		sheet3.division(5, 7);

	}
}
