package collectionstutotial;

import java.util.HashMap;
import java.util.Map;

public class EmpMain {

	public static void main(String[] args) {
		Map<Integer, Employee> mp = new HashMap<Integer, Employee>();
		
		Employee emp1 = new Employee(101,"sandeep",50000.00);
		Employee emp2 = new Employee(105,"abhay",60000.00);
		Employee emp3 = new Employee(102,"rudra",70000.00);
		Employee emp4 = new Employee(104,"akshay",10000.00);
		Employee emp5 = new Employee(103,"abhayraj",5000.00);
		
		mp.put(emp1.getId(), emp1);
		mp.put(emp2.getId(), emp2);
		mp.put(emp3.getId(), emp3);
		mp.put(emp4.getId(), emp4);
		mp.put(emp5.getId(), emp5);
		
		System.out.println("iterating over map : ");
		mp.forEach((id, value) -> {
			System.out.println(id + "  " + value);
		});
		

	}

}
