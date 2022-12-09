package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	//@Autowired
	private List<Student> studentList = new ArrayList<Student>(Arrays.asList(
			new Student(1, "sandeep singh", 19, new Address("town hall", "shahjahanpur")),
			new Student(2, "rudra parihar", 16, new Address("satellite", "bareilly")),
			new Student(3, "Abhay singh", 26, new Address("chowk", "shahjahanpur")),new Student(), new Student()));

	public List<Student> getStudentList() {
		return studentList;

//		Stream<Student> collectionStream = studentList.stream();
//		collectionStream.forEach(element -> {
//			if (element.getId() == id)
//				return element;
//
//		});
	}

	public void addStudent(Student s) {
		studentList.add(s);
	}

	public Student getStudentById(int id) {
//		for (int i = 0; i < studentList.size(); i++)
//			if (studentList.get(i).getId() == id)
//				return studentList.get(i);
//		System.out.println("Student not found");
//		return new Student();

		// using streams
		Student student = (Student) studentList.stream().filter(st -> st.getId() == (id)).findAny().orElse(null);
		return student;

	}

	public void UpdateStudentById(int id, Student s) {
		for (int i = 0; i < studentList.size(); i++)
			if (studentList.get(i).getId() == id)
				studentList.set(i, s);
		System.out.println("Student " + id + " data is updated !");
	}

	public void deleteStudentById(int id) {
//		for (int i = 0; i < studentList.size(); i++)
//			if (studentList.get(i).getId() == id)
//				studentList.remove(i);
//		System.out.println("Deletion Performed ");

		// using streams
		studentList = studentList.stream().filter(s -> s.getId() != id).toList();
		System.out.println("Deletion Performed ");
	}

}
