package functionalInterface;

import java.util.function.Predicate;

public class Predicateexample {

	public static void main(String[] args) {
		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
		var result = isLongerThan5.test("sandeeep");
		System.out.println("isLongerThan5.test(\"sandeeep\") : "+result);

		if (isLongerThan5.test("xyxbxabb"))
			System.out.println("condition is true");

	}

}
