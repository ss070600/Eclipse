package com.anno.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//@Primary
public class Address {
	private String city, state;

	public Address() {
		super();
		System.out.println("Address constructor invoked");
		this.city = "mumbai";
		this.state = "maharashtra";
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
