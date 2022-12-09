import java.util.Scanner;

public class sheet11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		while (true) {
			System.out.println("Enter number : ");
			number = sc.nextInt();
			if (number < 100)
				System.out.println("Number entered is less than 100");
			if (number >= 100) {
				System.out.println("Number entered is not less than 100");
				break;
			}
		}
	}

}
