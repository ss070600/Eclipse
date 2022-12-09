import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class xyz {

	public static void main(String[] args) {
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
	}

}
