import java.util.Scanner;

public class sheet6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int income = sc.nextInt();
		float taxPercent;
		if (age < 60) {
			if (income <= 250000)
				taxPercent = 0.0f;
			else if (income >= 250001 && income <= 500000)
				taxPercent = 0.1f;
			else if (income >= 500001 && income <= 1000000)
				taxPercent = 0.2f;
			else
				taxPercent = 0.3f;
		} else if (age >= 61 && age <= 80) {
			if (income <= 300000)
				taxPercent = 0.0f;
			else if (income >= 300001 && income <= 500000)
				taxPercent = 0.1f;
			else if (income >= 500001 && income <= 1000000)
				taxPercent = 0.2f;
			else
				taxPercent = 0.3f;
		} else {
			if (income <= 500000)
				taxPercent = 0.0f;
			else if (income >= 500001 && income <= 1000000)
				taxPercent = 0.2f;
			else
				taxPercent = 0.3f;
		}
		float tax = taxPercent * income;
		System.out.println(tax);

	}

}
