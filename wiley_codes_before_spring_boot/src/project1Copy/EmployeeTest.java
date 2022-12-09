package project1Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Set;

import serializable.Invoice;

class EmployeeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		char choice = 'E';

		// Creating initial file
		CreateInitialFile.createInitialFile();

		CompanyA company = new CompanyA();

		while (true) {
			System.out.println("Employee Management System");

			System.out.println("1. Get All Employees");
			System.out.println("2. Get Employee by ID");
			System.out.println("3. Add new Employee");
			System.out.println("4. Update Existing Employee");
			System.out.println("5. Delete Existing Employee");
			System.out.println("Enter your choice :>> ");
			int operation = sc.nextInt();

			boolean doSerialization = false;

			switch (operation) {
			case 1:
				company.getAll();
				break;
			case 2:
				System.out.println("Enter Employee ID : ");
				int id = sc.nextInt();
				sc.nextLine();

				try {
					company.getById(id);
				} catch (InvalidEmployeeException e1) {
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}

				break;
			case 3:
				Employee emp = new Employee();
				System.out.println("Enter Employee ID : ");
				emp.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Employee Name : ");
				emp.setName(sc.nextLine());
				System.out.println("Enter Employee Designation : ");
				emp.setDesignation(sc.nextLine());
				System.out.println("Enter Employee salary");
				emp.setSalary(sc.nextDouble());
				sc.nextLine();

				company.add(emp);
				System.out.println("Employee added successfully !!!");
				break;
			case 4:
				int eid;
				System.out.println("Enter Employee ID : ");
				eid = sc.nextInt();
				sc.nextLine();
				if (company.employeeExists(eid)) {
					Employee empl = new Employee();
					empl.setId(eid);
					System.out.println("Enter Employee Name : ");
					empl.setName(sc.nextLine());
					System.out.println("Enter Employee Designation : ");
					empl.setDesignation(sc.nextLine());
					System.out.println("Enter Employee salary");
					empl.setSalary(sc.nextDouble());
					sc.nextLine();

					try {
						company.update(eid, empl);
					} catch (InvalidEmployeeException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}

				} else {
					System.out.println("Invalid Employee ID !!!");
				}
				break;
			case 5:
				int empid;
				System.out.println("Enter Employee ID : ");
				empid = sc.nextInt();
				sc.nextLine();
				try {
					company.delete(empid);
				} catch (InvalidEmployeeException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

				break;
			default:
				System.out.println("Invalid Choice !!!");

			}

			System.out.println("Enter 'E' to exit else press any other key");
			choice = sc.next().charAt(0);
		}

	}

}
