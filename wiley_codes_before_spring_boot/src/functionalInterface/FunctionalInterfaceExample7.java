package functionalInterface;

import java.util.function.Supplier;

public class FunctionalInterfaceExample7 {

	public static void main(String[] args) {
		Supplier<Double> getRandom = () -> Math.random()*100;
		var result = getRandom.get();
		System.out.println(result);
	}

}
