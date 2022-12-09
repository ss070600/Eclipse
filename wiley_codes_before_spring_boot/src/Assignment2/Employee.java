package Assignment2;

public class Employee {
	String firstName, lastName;
	double salary;

	Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		if (salary < 0) {
			this.salary = 0.0;
			return;
		}
		this.salary = salary;
	}

	void displaydetails() {
		System.out.println("employee name is : " + this.getFirstName() + " " + this.getLastName());
		System.out.println("salary is : " + (this.getSalary() * 12));
	}

	void raiseSalary() {
		setSalary(this.salary * 1.1);
	}

}
