package com.autowiring.beans;

public class Employee {
	private String name;
	private Department department;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Department department) {
		super();
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
