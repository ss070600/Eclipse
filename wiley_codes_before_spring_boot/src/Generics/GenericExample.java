package Generics;

class Test<T> {
	T value;
	String message;

	Test() {

	}

	Test(T value) {
		this.value = value;
	}

	Test(T value, String message) {
		this.value = value;
		this.message = message;
	}

	public T getValue() {
		return this.value;
	}

	public String getMessage() {
		return this.message;
	}
}

public class GenericExample {

	public static void main(String[] args) {
		Test<Integer> test1 = new Test<Integer>(5);
		System.out.println(test1.getValue());
		Test<Integer> test2 = new Test<Integer>(15, "sandeep");
		System.out.println(test2.getValue() + "  " + test2.getMessage());

	}

}
