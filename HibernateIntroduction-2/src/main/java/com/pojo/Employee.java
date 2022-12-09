package com.pojo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "employee1") // name parameter is optional if not given it will give table name = Employee
public class Employee {
	@Id // mandatory annotation works as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	// this above annotation will work like auto increment of mysql and no matter
	// you provide what id's in the constructors while creating employee objects,
	// when you will save the objects then id's will be provided automatically and
	// by default it will start from 1 then 2 and so on... if we want to change the
	// starting point of id's we can (check documentation for that)
	int empId;

	// @Column is not compulsory annotation it will work fine as @Entity and @Id
	// annotations are enough and columns names of table will be equals to instance
	// variable names

	@Column(name = "fname") // name parameter is optional if not given it will give table name = fieldName
							// i.e is firstName in this case (@Column is also optional)
	String firstName;
	@Column(name = "lname")
	String lastName;
	@Column(name = "sal")
	double salary;

	Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String firstName, String lastName, double salary, Department dept) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", dept=" + dept + "]";
	}

}
