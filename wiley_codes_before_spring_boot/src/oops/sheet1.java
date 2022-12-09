package oops;

import java.util.Scanner;

public class sheet1 {
	int studentId;
	String studentName;
	int studentAge;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of student >");
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name : ");
		String name = sc.next();
		System.out.println("Enter student age : ");
		int age = sc.nextInt();
		sc.close();
		this.setStudentId(id);
		this.setStudentName(name);
		this.setStudentAge(age);
	}

	public void displayDetails() {
		System.out.println("Details of student >");
		System.out.println("student id : " + this.getStudentId());
		System.out.println("student name : " + this.getStudentName());
		System.out.println("student age : " + this.getStudentAge());
	}

	public static void main(String[] args) {
		sheet1 obj = new sheet1();
		obj.acceptDetails();
		obj.displayDetails();

	}
}
