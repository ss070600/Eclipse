package functionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
	private Integer id, age;
	private String firstName, lastName, gender;

	Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	Employee(Integer id, Integer age, String firstName, String lastName, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	protected Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected Integer getAge() {
		return age;
	}

	protected void setAge(Integer age) {
		this.age = age;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + "]";
	}

}

class EmployeePredicates {
	public static Predicate<Employee> isAdultMale() {
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<Employee> isAdultFemale() {
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("F");
	}

	public static Predicate<Employee> ismoreThan(int age) {
		return e -> e.getAge() > age;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
}

public class PredicateExample2 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, 19, "sandeep", "singh", "M"));
		employees.add(new Employee(102, 18, "akshay", "singh", "M"));
		employees.add(new Employee(103, 16, "abhay", "singh", "M"));
		employees.add(new Employee(104, 19, "renu", "singh", "F"));
		employees.add(new Employee(105, 25, "priya", "singh", "F"));
		employees.add(new Employee(106, 19, "sandeep", "singh", "M"));
		employees.add(new Employee(107, 22, "rudra", "singh", "M"));
		employees.add(new Employee(108, 19, "tamanna", "singh", "F"));

		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));
		System.out.println();
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultFemale()));
		System.out.println();
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.ismoreThan(20)));
		System.out.println();
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.ismoreThan(20).negate()));

		
	}

}
