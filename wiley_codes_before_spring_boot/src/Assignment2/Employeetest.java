package Assignment2;

public class Employeetest {

	public static void main(String[] args) {
		Employee obj1 = new Employee("sandeep", "singh", 5000.63);
		Employee obj2 = new Employee("adhiraj", "singh", 4000.63);

		obj1.displaydetails();
		obj2.displaydetails();

		obj1.raiseSalary();
		obj2.raiseSalary();

		obj1.displaydetails();
		obj2.displaydetails();
	}

}
