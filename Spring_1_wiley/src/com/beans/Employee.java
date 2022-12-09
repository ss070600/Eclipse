package com.beans;

public class Employee {
	int id;
	String aadhar, name;

	public Employee() {
		super();
		System.out.println("Employee default constructor called !!!");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(String aadhar, String name) {
		super();
		this.aadhar = aadhar;
		this.name = name;
	}

	public Employee(int id, String aadhar, String name) {
		super();
		this.id = id;
		this.aadhar = aadhar;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", aadhar=" + aadhar + ", name=" + name + "]";
	}

}
