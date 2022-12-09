package functionalInterface;

import java.util.function.Function;
public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		Function <String,Integer> functionref = (str)->str.length();
		int length = functionref.apply("hello World");
		System.out.println(length);

	}

}
