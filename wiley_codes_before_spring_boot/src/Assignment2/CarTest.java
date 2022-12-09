package Assignment2;

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

	void diplayDetails() {
		System.out.println("Vehicle color is : " + this.color);
		System.out.println("Vehicle speed is : " + this.speed);
		System.out.println("Vehicle regular price is : " + this.regularPrice);
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

	void diplayDetails() {
		System.out.println("Vehicle type : Truck");
		super.diplayDetails();
		System.out.println("Vehicle weight is : " + this.weight);
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

	void diplayDetails() {
		System.out.println("Vehicle type : Ford");
		super.diplayDetails();
		System.out.println("Vehicle manufracture year is : " + this.year);
		System.out.println("Vehicle manufracturer Discount is : " + this.manufacturerDiscount);
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

	void diplayDetails() {
		System.out.println("Vehicle type : Sedan");
		super.diplayDetails();
		System.out.println("Vehicle length is : " + this.length);
	}
}

public class CarTest {

	public static void main(String[] args) {
		Truck obj1 = new Truck(250, 100000, "red", 1000);
		Ford obj2 = new Ford(200, 50000, "blue", 1998, 1000);
		Sedan obj3 = new Sedan(300, 200000, "black", 20);

		obj1.diplayDetails();
		System.out.println();
		obj2.diplayDetails();
		System.out.println();
		obj3.diplayDetails();

	}

}
