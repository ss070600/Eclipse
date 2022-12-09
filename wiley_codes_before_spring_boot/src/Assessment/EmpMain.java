package Assessment;

import java.util.*;

public class EmpMain {

	public static void main(String[] args) {
		Set<Employee> treeSet = new TreeSet<Employee>();
		Employee p1 = new Employee(1011, "sandeep");
		Employee p2 = new Employee(102, "abhay");
		Employee p3 = new Employee(102, "rudra");
		Employee p4 = new Employee(1304, "adhiraj");
		Employee p5 = new Employee(1304, "akshay");
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		Iterator<Employee> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

	}

}
