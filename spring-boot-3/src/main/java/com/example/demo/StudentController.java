package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return getService().getStudentList();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return getService().getStudentById(id);
	}

	@PostMapping("/students")
	public void addStudent(@RequestBody Student s) {
		getService().addStudent(s);
	}

	@PutMapping("/students/{id}")
	public void updateStudent(@PathVariable("id") int id, @RequestBody Student s) {
		getService().UpdateStudentById(id, s);
	}

	@GetMapping("/delete students/{id}")
	public void deleteStudentById(@PathVariable("id") int id) {
		getService().deleteStudentById(id);
	}
}
