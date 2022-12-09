package functionalInterface;

import java.util.function.BiConsumer;

public class FunctionalInterfaceExample6 {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> checkCriteria = (age,marks)->{
			if(age>=18 && marks>=75)
				System.out.println("congrats you are shortlisted");
			else
				System.out.println("Better luck next time ");
		};
		checkCriteria.accept(24,69);
		checkCriteria.accept(24,75);

	}

}
