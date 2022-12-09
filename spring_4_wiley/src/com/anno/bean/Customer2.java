package com.anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// creates the beans with id equal to the class name exactly but in lower case by default
@Component(value = "cus101")
public class Customer2 {
	private int id;
	private String name;
	@Autowired //@Qualifier(value="address1")
	private Address customerAddress;

	public Customer2() {
		super();
		this.id = 105;
		this.name = "sandeep";
	}

	@Override
	public String toString() {
		return "Customer2 [id=" + id + ", name=" + name + ", address=" + customerAddress + "]";
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

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	

}
