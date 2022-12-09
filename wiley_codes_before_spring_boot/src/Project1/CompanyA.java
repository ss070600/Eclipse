package Project1;

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
	public void getAllEmployees() {
		System.out.println("Displaying details of all Employees");
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			itr.next().displayDetails();
		}
	}

	@Override
	public void getEmployeeById(int id) throws InvalidEmployeeException {
		Iterator<Employee> itr = employees.iterator();
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
	public void addEmployee(Employee employee) {
		employees.add(employee);
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
	public void updateEmployee(int id, Employee employee) throws InvalidEmployeeException {
		Iterator<Employee> itr = employees.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				idFound = true;
				emp.setId(employee.getId());
				emp.setName(employee.getName());
				emp.setDesignation(employee.getDesignation());
				emp.setSalary(employee.getSalary());

			}
		}
		if (idFound == false)
			throw new InvalidEmployeeException();
	}

	@Override
	public void deleteEmployee(int id) throws InvalidEmployeeException {
		Iterator<Employee> itr = employees.iterator();
		boolean idFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getId() == id) {
				idFound = true;
				employees.remove(emp);
			}
		}
		if (idFound == false)
			throw new InvalidEmployeeException();
	}
}
