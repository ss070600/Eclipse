package inheritence;

import java.util.Scanner;

class Student {
	private int id;
	private String name, course;
	private static String schoolName;

	static {
		Student.schoolName = "xyz";
	}
	Scanner sc = new Scanner(System.in);

	public void acceptDetails() {
		System.out.println("Enter Student Id : ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		this.name = sc.nextLine();
		System.out.println("Enter Student course : ");
		this.course = sc.nextLine();
	}
	public void displayDetails() {
		System.out.println("Students Basic info : >");
		System.out.println("id : "+this.id);
		System.out.println("name : "+this.name);
		System.out.println("course : "+this.course);
		System.out.println("school : "+Student.schoolName);
	}
}

class Marks extends Student{
	protected float objectiveMarks,subjectiveMarks;
	
	public void acceptDetails1() {
		System.out.println("Enter objective marks : ");
		this.objectiveMarks = sc.nextFloat();
		System.out.println("Enter objective marks : ");
		this.subjectiveMarks = sc.nextFloat();
	}
	public void displayDetails1() {
		System.out.println("Marks Scored : ");
		System.out.println("objective marks : "+this.objectiveMarks);
		System.out.println("subjective marks : "+this.subjectiveMarks);
	}
}

class Sports extends Marks{
	protected float score;
	public void acceptDetails2() {
		System.out.println("Enter sports marks : ");
		this.score = sc.nextFloat();
	}
	public void displayDetails2() {
		System.out.println("sports marks : "+this.score);
	}
}

class Result extends Sports{
	float totalMarks,averageMarks;
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks+this.subjectiveMarks+this.score;
		this.averageMarks =this.totalMarks/3;
	}
}

public class MainEntry{
	public static void main(String[] args) {
		Marks obj = new Marks();
		obj.acceptDetails();
		obj.acceptDetails1();
		
		obj.displayDetails();
		obj.displayDetails1();
	}
}


















