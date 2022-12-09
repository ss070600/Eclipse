package project1Copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateInitialFile {
	public static void createInitialFile() throws IOException {
		CompanyA companyObject = new CompanyA();
		Employee employee1 = new Employee(101, "sandeep", "intern", 50000);
		Employee employee2 = new Employee(102, "abhay", "PAT", 25000);
		Employee employee3 = new Employee(103, "akhand", "PA", 60000);
		Employee employee4 = new Employee(104, "akshay", "A", 50560);
		Employee employee5 = new Employee(105, "rudra", "Manager", 50630.63);
		Employee employee6 = new Employee(106, "adhiraj", "PA", 165234.63);
		Employee employee7 = new Employee(107, "rahul", "A", 15943.36);

		companyObject.add(employee1);
		companyObject.add(employee2);
		companyObject.add(employee3);
		companyObject.add(employee4);
		companyObject.add(employee5);
		companyObject.add(employee6);
		companyObject.add(employee7);

		FileOutputStream outStream1 = new FileOutputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectOutputStream out1 = new ObjectOutputStream(outStream1);
		out1.writeObject(companyObject);
		out1.flush();
		out1.close();
		outStream1.close();
		System.out.println("Initial serialized file created successfully");
	}
}
