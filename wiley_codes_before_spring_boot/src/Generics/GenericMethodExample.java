package Generics;

import java.util.Arrays;

class MyClass<T> {
	T[] array;

	static <T> T  display1(T value1) {
		return value1;
	}

	 T  xyz(T value1) {
		return value1;
	}
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(T[] array) {
		super();
		this.array = array;
	}

	public void displayArray() {
		for (T i : this.array)
			System.out.print(i+" ");
	}

	static <T>  void display2(T value1) {
		System.out.println(value1.getClass().getName() + " : " + value1);
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		MyClass.display2(500);
		MyClass.display2("sandeep");
		System.out.println(MyClass.display1("sandeep"));

		MyClass<Integer> obj1 = new MyClass<Integer>();
		MyClass<Character> obj2 = new MyClass<Character>();

		obj1.array = new Integer[10];
		obj2.array = new Character[10];

		Arrays.fill(obj1.array, 10);
		Arrays.fill(obj2.array, 's');

		obj1.displayArray();
		System.out.println();
		obj2.displayArray();

	}
}
