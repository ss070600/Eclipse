package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaceExample8 {
	public static Supplier<List<Employee>> populateEmployees() {
		Supplier<List<Employee>> employeeList = () -> {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			employees.add(new Employee(101, 19, "sandeep", "singh", "M"));
			employees.add(new Employee(102, 18, "akshay", "singh", "M"));
			employees.add(new Employee(103, 16, "abhay", "singh", "M"));
			employees.add(new Employee(104, 19, "renu", "singh", "F"));
			employees.add(new Employee(105, 25, "priya", "singh", "F"));
			employees.add(new Employee(106, 19, "sandeep", "singh", "M"));
			employees.add(new Employee(107, 22, "rudra", "singh", "M"));
			employees.add(new Employee(108, 19, "tamanna", "singh", "F"));
			return employees;
		};
		return employeeList;

	}

	public static void main(String[] args) {
		System.out.println(populateEmployees().get());

	}

}
