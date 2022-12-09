package com.beans;

public class Car {
	int chasisNo;
	String make, color;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int chasisNo, String make, String color) {
		super();
		this.chasisNo = chasisNo;
		this.make = make;
		this.color = color;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [chasisNo=" + chasisNo + ", make=" + make + ", color=" + color + "]";
	}

}
