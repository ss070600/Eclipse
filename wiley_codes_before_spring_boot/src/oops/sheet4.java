package oops;

import java.util.Scanner;

public class sheet4 {
	private int admissionNumber;
	private String studentName;
	private float englishScore, mathScore, scienceScore, totalScore;
	static String courseName, collegeName;

	static {
		courseName = "C070600";
		collegeName = "Chandigarh University";
	}

	private float ctotal() {
		return this.englishScore + this.mathScore + this.scienceScore;
	}
	
	Scanner sc = new Scanner(System.in);
	public void takeData() {
		System.out.print("Enter admission number : ");
		this.admissionNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter student name : ");
		this.studentName = sc.nextLine();
		System.out.print("Enter english score : ");
		this.englishScore = sc.nextInt();
		System.out.print("Enter Math score : ");
		this.mathScore = sc.nextInt();
		System.out.print("Enter Science score : ");
		this.scienceScore = sc.nextInt();
		this.totalScore = this.ctotal();
		System.out.println();

	}

	public void showData() {
		System.out.println("College name : " + collegeName);
		System.out.println("Course name : " + courseName);
		System.out.println("Admission number : " + this.admissionNumber);
		System.out.println("Student name : " + this.studentName);
		System.out.println("Your English score : " + this.englishScore);
		System.out.println("Your Math score : " + this.mathScore);
		System.out.println("Your Science score : " + this.scienceScore);
		System.out.println("Your total is : " + this.totalScore);
		System.out.println();
	}

	public static void main(String[] args) {
		sheet4[] array = new sheet4[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter student " + (i + 1) + " details > ");
			sheet4 temp = new sheet4();
			temp.takeData();
			array[i] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Details of stuent " + (i + 1) + " are : ");
			array[i].showData();
		}
	}

}
