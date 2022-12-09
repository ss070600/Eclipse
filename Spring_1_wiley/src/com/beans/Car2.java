package com.beans;

public class Car2 {
	private int chasisNo;
	private String make, color;

	public Car2() {
		this.chasisNo = 2356;
		this.make = "xyz";
		this.color = "blue";
	}

	@Override
	public String toString() {
		return "Car [chasisNo=" + chasisNo + ", make=" + make + ", color=" + color + "]";
	}

}
