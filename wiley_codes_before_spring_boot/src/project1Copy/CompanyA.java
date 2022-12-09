package project1Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CompanyA implements Serializable, IOInterface {
	static Set<Employee> employees = new TreeSet<Employee>();

	static Set<Employee> getEmployees() {
		return employees;
	}

	static void setEmployees(Set<Employee> employees) {
		CompanyA.employees = employees;
	}

	@Override
	public void getAll() throws IOException, ClassNotFoundException {
		FileInputStream inStream1 = new FileInputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		CompanyA company = (CompanyA) in1.readObject();
		in1.close();
		inStream1.close();
		System.out.println("companyObject deserialized successfully\n");

		System.out.println("Displaying details of all Employees");
		Iterator<Employee> itr = company.employees.iterator();
		while (itr.hasNext()) {
			itr.next().displayDetails();
		}
	}

	@Override
	public void getById(int id) throws IOException, ClassNotFoundException, InvalidEmployeeException {
		FileInputStream inStream1 = new FileInputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		CompanyA company = (CompanyA) in1.readObject();
		in1.close();
		inStream1.close();
		System.out.println("companyObject deserialized successfully\n");

		Iterator<Employee> itr = company.employees.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				idFound = true;
				emp.displayDetails();
			}
		}
		if (idFound == false)
			throw new InvalidEmployeeException();
	}

	@Override
	public void add(Object employee) {
		employees.add((Employee) employee);
	}

	boolean employeeExists(int id) {
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void update(int id, Object employee) throws IOException, ClassNotFoundException, InvalidEmployeeException {
		FileInputStream inStream1 = new FileInputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		CompanyA company = (CompanyA) in1.readObject();
		in1.close();
		inStream1.close();
		System.out.println("companyObject deserialized successfully\n");

		Iterator<Employee> itr = company.employees.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				idFound = true;
				emp.setId(((Employee) employee).getId());
				emp.setName(((Employee) employee).getName());
				emp.setDesignation(((Employee) employee).getDesignation());
				emp.setSalary(((Employee) employee).getSalary());

				FileOutputStream outStream2 = new FileOutputStream(
						"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
				ObjectOutputStream out2 = new ObjectOutputStream(outStream2);
				out2.writeObject(company);
				out2.flush();
				out2.close();
				outStream2.close();
				System.out.println("\ncompany serialized successfully\n");

			}
		}
		if (idFound == false)
			throw new InvalidEmployeeException();
	}

	@Override
	public void delete(int id) throws IOException, ClassNotFoundException, InvalidEmployeeException {
		FileInputStream inStream1 = new FileInputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		CompanyA company = (CompanyA) in1.readObject();
		in1.close();
		inStream1.close();
		System.out.println("companyObject deserialized successfully\n");

		Iterator<Employee> itr = company.employees.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				idFound = true;
				company.employees.remove(emp);
				FileOutputStream outStream2 = new FileOutputStream(
						"C:\\Users\\sandeep singh\\Desktop\\file handling\\project1.txt");
				ObjectOutputStream out2 = new ObjectOutputStream(outStream2);
				out2.writeObject(company);
				out2.flush();
				out2.close();
				outStream2.close();
				System.out.println("\ncompany serialized successfully\n");
				break;
			}
		}
		if (idFound == false)
			throw new InvalidEmployeeException();
	}
}
