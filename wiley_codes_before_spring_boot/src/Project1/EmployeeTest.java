package Project1;

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

		CompanyA companyObject = new CompanyA();
		Employee employee1 = new Employee(101, "sandeep", "intern", 50000);
		Employee employee2 = new Employee(102, "abhay", "PAT", 25000);
		Employee employee3 = new Employee(103, "akhand", "PA", 60000);
		Employee employee4 = new Employee(104, "akshay", "A", 50560);
		Employee employee5 = new Employee(105, "rudra", "Manager", 50630.63);
		Employee employee6 = new Employee(106, "adhiraj", "PA", 165234.63);
		Employee employee7 = new Employee(107, "rahul", "A", 15943.36);

		companyObject.addEmployee(employee1);
		companyObject.addEmployee(employee2);
		companyObject.addEmployee(employee3);
		companyObject.addEmployee(employee4);
		companyObject.addEmployee(employee5);
		companyObject.addEmployee(employee6);
		companyObject.addEmployee(employee7);
		// ------------------------------------------------------------------------------------
		FileOutputStream outStream1 = new FileOutputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectOutputStream out1 = new ObjectOutputStream(outStream1);
		out1.writeObject(companyObject);
		out1.flush();
		out1.close();
		outStream1.close();
		System.out.println("companyObject serialized successfully");

		FileInputStream inStream1 = new FileInputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		CompanyA company = (CompanyA) in1.readObject();
		// company.getAllEmployees();
		in1.close();
		inStream1.close();
		System.out.println("companyObject deserialized successfully\n");
		// ------------------------------------------------------------------------------------

		while (true) {
			System.out.println("Employee Management System");
			System.out.println("Enter your choice : ");
			System.out.println("1. Get All Employees");
			System.out.println("2. Get Employee by ID");
			System.out.println("3. Add new Employee");
			System.out.println("4. Update Existing Employee");
			System.out.println("5. Delete Existing Employee");
			int operation = sc.nextInt();

			boolean doSerialization = false;

			switch (operation) {
			case 1:
				company.getAllEmployees();
				break;
			case 2:
				System.out.println("Enter Employee ID : ");
				int id = sc.nextInt();
				
				try {
					company.getEmployeeById(id);
				} catch (InvalidEmployeeException e1) {
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}
				
				break;
			case 3:
				doSerialization = true;
				Employee emp = new Employee();
				System.out.println("Enter Employee ID : ");
				emp.setId(sc.nextInt());
				System.out.println("Enter Employee Name : ");
				emp.setName(sc.nextLine());
				sc.nextLine();
				System.out.println("Enter Employee Designation : ");
				emp.setDesignation(sc.nextLine());
				// sc.nextLine();
				System.out.println("Enter Employee salary");
				emp.setSalary(sc.nextDouble());
				// sc.nextLine();

				System.out.println(emp.name);
				company.addEmployee(emp);
				System.out.println("Employee added successfully !!!");
				break;
			case 4:
				doSerialization = true;
				int eid;
				System.out.println("Enter Employee ID : ");
				eid = sc.nextInt();
				if (company.employeeExists(eid)) {
					Employee empl = new Employee();
					empl.setId(eid);
					System.out.println("Enter Employee Name : ");
					empl.setName(sc.nextLine());
					sc.nextLine();
					System.out.println("Enter Employee Designation : ");
					empl.setDesignation(sc.nextLine());
					// sc.nextLine();
					System.out.println("Enter Employee salary");
					empl.setSalary(sc.nextDouble());
					sc.nextLine();

					try {
						company.updateEmployee(eid, empl);
					} catch (InvalidEmployeeException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					break;
				} else {
					System.out.println("Invalid Employee ID !!!");
				}
			case 5:
				doSerialization = true;
				int empid;
				System.out.println("Enter Employee ID : ");
				empid = sc.nextInt();
				try {
					company.deleteEmployee(empid);
				} catch (InvalidEmployeeException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

				break;
			default:
				System.out.println("Invalid Choice !!!");

			}

			if (doSerialization == true) {
				// serializing again
				FileOutputStream outStream2 = new FileOutputStream(
						"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
				ObjectOutputStream out2 = new ObjectOutputStream(outStream2);
				out2.writeObject(company);
				out2.flush();
				out2.close();
				outStream2.close();
				System.out.println("\ncompany serialized successfully\n");
				// serializing done
			}

			System.out.println("Enter 'E' to exit else press any other key");
			choice = sc.next().charAt(0);
		}

	}

}
