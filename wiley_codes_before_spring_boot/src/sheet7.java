import java.util.*;

public class sheet7 {

	public static void main(String[] args) {
		System.out.println("Enter your role");
		System.out.println("1 for admin");
		System.out.println("2 for subAdmin");
		System.out.println("3 for testprep");
		System.out.println("4 for user");
		int c = (new Scanner(System.in)).nextInt();
		switch (c) {
		case 1:
			System.out.println("full access");
			break;
		case 2:
			System.out.println("access to create/delete courses");
			break;
		case 3:
			System.out.println("access to create/delete tests");
			break;
		case 4:
			System.out.println("accss to consume content");
			break;
		default:
			System.out.println("no access");
			break;
		}

	}

}
