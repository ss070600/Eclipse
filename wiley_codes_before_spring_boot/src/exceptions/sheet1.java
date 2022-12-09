package exceptions;

public class sheet1 {
	public static void division(int a, int b) {
		try {
			int res = a / b;
			System.out.println("result is : " + res);
		} catch (Exception ex) {
			System.out.println("exception occured");
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		System.out.println("remaining code");
	}

	public static void main(String[] args) {
		sheet1.division(5, 0);

	}
}
