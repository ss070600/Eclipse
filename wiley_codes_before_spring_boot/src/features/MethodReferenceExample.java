package features;

import java.util.function.BiFunction;

interface Printer {
	void print();
}

class ConsolePrinter {

	public ConsolePrinter() {
		System.out.println("constructor of  ConsolePrinter");
	}

	public void printMessage() {
		System.out.println("instance printMessage called");
	}

	public static void print() {
		System.out.println("print called");
	}

	public static int addition(int a, int b) {
		return a + b;
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {

		// reference to a static method
		Printer printer = ConsolePrinter::print;
		printer.print();

		// reference to a static method
		BiFunction<Integer, Integer, Integer> additionCall = ConsolePrinter::addition;
		int result = additionCall.apply(100, 200);
		System.out.println(result);

		// reference to a instance method
		ConsolePrinter ref = new ConsolePrinter();
		Printer printer1 = ref::printMessage;
		printer1.print();

		// reference to costructor
		Printer printer2 = ConsolePrinter::new;
		printer2.print();

	}

}
