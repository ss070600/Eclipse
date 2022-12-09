package functionalInterface;

import java.util.HashMap;
import java.util.function.Function;

class Student {
	static HashMap<Integer, String> students = new HashMap<Integer, String>();

	public static void addStudent(String studentName, int studentId) {
		if (!students.containsKey(studentId)) {
			students.put(studentId, studentName);
		} else {
			System.out.println("Student already registered");
		}
	}
}

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		Function<Integer, String> getDetails = (Integer id) -> {
			if (Student.students.containsKey(id)) {
				return Student.students.get(id);
			} else {
				return "Student doesnt exist with this id";
			}
		};

		Student.addStudent("a", 1);
		Student.addStudent("b", 2);
		Student.addStudent("c", 3);
		Student.addStudent("d", 4);
		Student.addStudent("e", 5);

		System.out.println(getDetails.apply(1102));
		System.out.println(getDetails.apply(1));
	}

}
