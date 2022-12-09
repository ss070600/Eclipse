import java.util.Scanner;

public class sheet3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cp = sc.nextInt(), sp = sc.nextInt();
		if (cp > sp)
			System.out.println("loss");
		else if (cp < sp)
			System.out.println("profit");
		else
			System.out.println("no profit no loss");
		// ternary
		String s = cp > sp ? "loss" : (cp < sp ? "profit" : "no profit no loss");
		System.out.println(s);
		sc.close();
	}

}
