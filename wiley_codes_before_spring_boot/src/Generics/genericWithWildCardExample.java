package Generics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void drawShape();
}

class Square extends Shape {
	@Override
	void drawShape() {
		System.out.println("Square drawShape");
	}
}

class Rectangle extends Shape {
	@Override
	void drawShape() {
		System.out.println("Rectangle drawShape");
	}
}

public class genericWithWildCardExample {
	public static void drawing(List<? extends Shape> shapeList) {
		for (Shape shape : shapeList) {
			shape.drawShape();
		}
	}

	public static void main(String[] args) {
		List<Square> list1 = new ArrayList<Square>();
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		
		drawing(list1);
		
		List<Rectangle> list2 = new ArrayList<Rectangle>();
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		
		drawing(list2);

	}

}
