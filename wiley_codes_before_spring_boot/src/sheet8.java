import java.util.Scanner;

class Employee2 {
	String firstName, lastName;
	double salary;

	Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	Employee2(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.setSalary(salary);
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
		if (salary < 0)
			this.salary = 0.0;
		else
			this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("employe name : " + this.getFirstName() + " " + this.getLastName());
		System.out.println("salary (yearly): " + this.getSalary()*12);
	}

	public void raiseSalary() {
		this.setSalary(this.getSalary() * 1.1);
	}
}

public class sheet8 {

	public static void main(String[] args) {
		Employee2 obj1 = new Employee2("sandeep","singh",-50);
		Employee2 obj2 = new Employee2("adhiraj","singh",10000);
		
		obj1.displayDetails();
		obj2.displayDetails();
		obj2.raiseSalary();
		obj2.displayDetails();

	}

}
