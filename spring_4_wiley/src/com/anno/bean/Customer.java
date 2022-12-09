package com.anno.bean;

import org.springframework.stereotype.Component;

// creates the beans with id equal to the class name exactly but in lower case by default
@Component
public class Customer {
	private int id;
	private String name;

	public Customer() {
		super();
		this.id = 105;
		this.name = "sandeep";
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
