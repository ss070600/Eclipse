package misc;

import java.util.Objects;

class Employee {
	int id;
	String firstName, lastName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(firstName, id, lastName);
//	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;

		if (getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return (this.getId() == emp.getId()) && Objects.equals(firstName, emp.firstName)
				&& Objects.equals(lastName, emp.lastName);
	}

}

public class OverrideEqualsMethod {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "sandeep", "singh");
		Employee emp2 = new Employee(101, "sandeep", "singh");
		Employee emp3 = new Employee(102, "akshay", "jawla");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));

	}

}
