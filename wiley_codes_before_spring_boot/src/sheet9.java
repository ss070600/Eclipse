import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sheet9 {
	static int[] arr = new int[20];

	public static int average() {
		int sum = 0;
		for (int i : arr)
			sum += i;
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 2;
		
		while (choice != -1) {
			for (int i = 0; i < 20; i++)
				arr[i] = sc.nextInt();
			System.out.println("average : "+average());
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
		}
	}
}
