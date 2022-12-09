package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalInterfaceExample3 {

	public static void main(String[] args) {
		BinaryOperator<Integer> addition = (a, b) -> a + b;
		Function<Integer, Integer> square = (a) -> a * a;

		// applying chaining of methods
		var result = addition.andThen(square).apply(1, 2);
		System.out.println(result);

	}

}
