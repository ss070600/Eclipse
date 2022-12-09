package com.beans;

public class CarFactory {
	private static Car2 car = new Car2();

	public Car2 buildCar() {
		System.out.println("Building car...");
		return car;
	}
}
