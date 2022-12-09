package overloading;

public class methodOverloadingExample {
	class calculation {
		public void addition(int num1, int num2) {
			System.out.println("The sum of two integer numbers: " + (num1 + num2));
		}

		public void addition(float num1, float num2) {
			System.out.println("The sum of two float numbers: " + (num1 + num2));
		}

		public void addition(int num1, int num2, int num3) {
			System.out.println("The sum of three integer numbers:" + (num1 + num2 + num3));
		}

		public void addition(int num1, float num2) {
			System.out.println("The sum of int and float: " + (num1 + num2));
		}

		public void addition(float num1, int num2) {
			System.out.println("The sum of float and int : " + (num1 + num2));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
