package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Javafundamentals {
	int num1, num2, num3;

	// 1
	int productOfThreeNumbers(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	// 2
	double farenheitToCelsius(double farenheit) {
		return (9.0 / 5) * (farenheit - 32);
	}

	// 3
	void print1To4() {
		System.out.println("1 2 3 4");
		System.out.print("1 2 3 4\n");
		System.out.printf("1 2 3 4\n");
	}

	// 4
	void addSubtractDivideMultiply(int a, int b) {
		System.out.println("addition is : " + (a + b));
		System.out.println("difference is : " + (a - b));
		System.out.println("multiplication is: " + (a * b));
		if (b == 0)
			System.out.println("division not possible by zero");
		else
			System.out.println("division is : " + (a / b));
	}

	// 5
	void isLarger(int num1, int num2) {
		if (num1 == num2)
			System.out.println("These numbers are equal");
		else
			System.out.println((num1 > num2 ? num1 : num2) + " is larger");
	}

	// 6
	void sumAverageProductAndSmallOrLarge(int a, int b, int c) {
		System.out.println("sum is : " + (a + b + c));
		System.out.println("average is : " + ((a + b + c) / 3));
		System.out.println("product is : " + (a * b * c));
		System.out.println("smallest number is : " + (a < b ? (a < c ? a : c) : (b < c ? b : c)));
		System.out.println("largest number is : " + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
	}

	// 7
	void isMultiple(int a, int b) {
		if (a % b == 0)
			System.out.println("yes, first number is multiple of second number");
		else
			System.out.println("No, first number is not a multiple of second number");
	}

	// 8
	void largestNumber(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (largest < arr[i])
				largest = arr[i];
		System.out.println("largest is : " + largest);
	}

	// 9
	void printPattern() {
		int n = 5;
		int[] arr = new int[] { 1, 10, 100, 1000 };
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(i * arr[j - 1] + " ");
			}
			System.out.println();
		}
	}

	// 10
	void sphereVolume(double radius) {
		System.out.println("Volume of the sphere is : " + ((4.0 / 3) * Math.PI * Math.pow(radius, 3)));
	}

	// 11
	void problem11() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Arrays.fill(arr, 0);
		System.out.println("Array after 1st operation is : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 0; i < arr.length; i++)
			arr[i] += 1;
		System.out.println("Array after 2nd operation is : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("Array after 3rd operation is : ");
		int index = 0;
		while (index < arr.length) {
			for (int i = 0; i < 5 && index < arr.length; i++, index++) {
				System.out.print(arr[index] + " ");
			}
			System.out.println();
		}
	}

	// 12
	void problem12(String str) {
		System.out.println(str.toUpperCase() + str.toLowerCase());
	}

	// 13
	static int[] arr = new int[20];

	public static int average() {
		int sum = 0;
		for (int i : arr)
			sum += i;
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Javafundamentals obj1 = new Javafundamentals();

//		System.out.println("enter three numbers : ");
//		System.out.println(obj1.productOfThreeNumbers(sc.nextInt(), sc.nextInt(), sc.nextInt()));
//
//		System.out.println("enter temprature in farenheit : ");
//		System.out.println(obj1.farenheitToCelsius(sc.nextDouble()));
//
//		System.out.println("print1To4 called below : ");
//		obj1.print1To4();
//
//		System.out.println("Enter two numbers");
//		obj1.addSubtractDivideMultiply(sc.nextInt(), sc.nextInt());
//
//		System.out.println("Enter three numbers");
//		obj1.sumAverageProductAndSmallOrLarge(sc.nextInt(), sc.nextInt(), sc.nextInt());
//
//		int[] arr = new int[10];
//		System.out.println("enter 10 integer values : ");
//		for (int i = 0; i < 10; i++)
//			arr[i] = sc.nextInt();
//		obj1.largestNumber(arr);
//		
//		obj1.printPattern();
//
//		System.out.println("Enter radius of sphere : ");
//		obj1.sphereVolume(sc.nextDouble());
//
//		obj1.problem11();
//
//		sc.nextLine();
//		System.out.println("Enter String : ");
//		obj1.problem12(sc.next());

		// problem13 code below
		System.out.println("Enter 20 integers : ");
		int choice = 2;
		while (choice != -1) {
			for (int i = 0; i < 20; i++)
				arr[i] = sc.nextInt();
			System.out.println("average : " + average());
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
		}
	}

}
