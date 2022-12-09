package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceExample5 {

	public static void main(String[] args) {
		List<Integer> list = List.of(101, 102, 103, 104, 105);

		// imperative programming(for,if-else,switch)
		for (var i : list)
			System.out.print(i + " ");
		System.out.println();

		// Declarative programming (Functional Programming)
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		List<String> name = List.of("king", "kochar", "priya", "gautam");
		Consumer<String> printNmaesUpper = item -> System.out.print(item.toUpperCase() + " ");
		Consumer<String> printNmaesLower = item -> System.out.print(item.toLowerCase() + " ");
		name.forEach(printNmaesUpper);
		System.out.println();
		name.forEach(printNmaesLower);
		System.out.println();
		name.forEach(printNmaesUpper.andThen(printNmaesLower));
		System.out.println();

	}

}
