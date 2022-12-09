package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		stream.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();

		Stream<String> stringStream = Stream.of("king", "kochar", "sandeep");

		stringStream.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();

		Stream<Integer> integerStream = Stream.of(100, 200, 300, 400, 500);
		integerStream.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();

		Stream<Integer> arrayStream = Stream.of(new Integer[] { 1000, 2000, 3000, 4000, 5000 });
		arrayStream.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();

		Integer[] numberArray = new Integer[] { 1, 2, 3, 4, 5, 6 };
		// Stream<Integer> arrayStream2 = Stream.of(numberArray); // this also works &
		// below line also works
		Stream<Integer> arrayStream2 = Arrays.stream(numberArray);
		arrayStream2.forEach(element -> {
			System.out.print(element + " ");
		});

		System.out.println();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1000);
		integerList.add(2000);
		integerList.add(3000);
		integerList.add(4000);
		integerList.add(5000);

		Stream<Integer> collectionStream = integerList.stream();
		collectionStream.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();

		Stream<String> builderStream = Stream.<String>builder().add("king").add("kochar").add("sandeep").add("john")
				.build();
		builderStream.forEach(element -> {
			System.out.print(element + " ");
		});

		System.out.println();

		IntStream str = IntStream.range(4, 11);
		str.forEach(element -> {
			System.out.print(element + " ");
		});
	}

}
