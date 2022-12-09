package Project1;

import java.io.Serializable;

class Employee implements Comparable<Employee>,Serializable {
	int id;
	String name, designation;
	double salary;

	Employee() {
		super();
	}

	Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee employee) {// to sort by id
		return this.getId() - employee.getId();
	}

	void displayDetails() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Given below are the details of Employee with ID = " + this.getId());
		System.out.println("ID : " + this.getId());
		System.out.println("Name : " + this.getName());
		System.out.println("Designation : " + this.getDesignation());
		System.out.println("Salary : " + this.getSalary());
		System.out.println("---------------------------------------------------------------------------");

	}

}
