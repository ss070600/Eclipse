package inheritence;

import java.util.Scanner;

class Car {
	protected int speed;
	protected double regularPrice;
	protected String color;

	Car(int speed, double price, String color) {
		this.speed = speed;
		this.regularPrice = price;
		this.color = color;
	}

	protected double getSalePrice() {
		return this.regularPrice;
	}
}

class Truck extends Car {
	int weight;

	Truck(int speed, double price, String color, int weight) {
		super(speed, price, color);
		this.weight = weight;
	}

	protected double getSalePrice() {
		if (weight > 2000)
			return 0.90 * super.getSalePrice();
		return 0.80 * super.getSalePrice();
	}
}

class Ford extends Car {
	int year, manufacturerDiscount;

	Ford(int speed, double price, String color, int year, int discount) {
		super(speed, price, color);
		this.year = year;
		this.manufacturerDiscount = discount;
	}

	protected double getSalePrice() {
		return super.getSalePrice() - this.manufacturerDiscount;
	}
}

class Sedan extends Car {
	int length;

	Sedan(int speed, double price, String color, int length) {
		super(speed, price, color);
		this.length = length;
	}

	protected double getSalePrice() {
		if (length > 20)
			return super.getSalePrice() * 0.95;
		return super.getSalePrice() * 0.90;
	}
}

public class Main {

	public static void main(String[] args) {
		Truck obj2 = new Truck(250, 100000, "red", 1000);
		Ford obj3 = new Ford(200, 50000, "blue", 1998, 1000);
		Sedan obj4 = new Sedan(300, 200000, "black", 20);

	}

}
