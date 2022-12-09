package Generics;

class Calculation<T, U> {
	T value1;
	U value2;

	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculation(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public void display() {
		System.out.println("value1 : " + this.value1);
		System.out.println("value2 : " + this.value2);
	}
}

public class GenericClassMultipleTypeExample {

	public static void main(String[] args) {
		System.out.println("obj1");
		Calculation<Integer, Integer> obj1 = new Calculation<Integer, Integer>(5, 15);
		obj1.display();
		System.out.println();
		System.out.println("obj2");
		Calculation<Integer, String> obj2 = new Calculation<Integer, String>(1, "sandeep");
		obj2.display();
	}

}
