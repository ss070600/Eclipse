package functionalInterface;

import java.util.function.UnaryOperator;
import java.util.function.Function;

public class FunctionalInterfaceExample4 {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = (a) -> a*a;
		UnaryOperator<Integer> doubled = (a) -> 2*a;
		var result = square.andThen(doubled).apply(5);
		System.out.println(result);

	}

}