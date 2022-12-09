package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String area, city;

	public Address() {
		super();
		this.area="Default AREA";
		this.city="Default CITY";
	}

	public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}

}
