package Assignment1;

/*
Define a class named as circle that contains two private instance variables: radius (of type double) and 
color (of type String), with default value of 1.0 and "red", respectively.
Create two overloaded constructors one with default values and another for assigning radius using 
parameterized constructor. Also define two public methods display() and getArea() to display the details 
of Circle and calculate the area.
*/

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		super();
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Circle obj1 = new Circle();
		obj1.display();
		Circle obj2 = new Circle(5, "black");
		obj2.display();
	}

	public void display() {
		System.out.println("color of square is : " + this.getColor());
		System.out.println("Area of square is : " + this.getArea());
	}

	public double getArea() {
		return 3.14 * Math.pow(this.getRadius(), 2);
	}

}
