package com.beans;

public class Address {
	String buildingName, area, city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String buildingName, String area, String city) {
		super();
		this.buildingName = buildingName;
		this.area = area;
		this.city = city;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
		return "Address [buildingName=" + buildingName + ", area=" + area + ", city=" + city + "]";
	}
	
}
