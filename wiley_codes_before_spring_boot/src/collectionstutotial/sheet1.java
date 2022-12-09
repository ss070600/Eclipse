package collectionstutotial;

import java.util.*;

public class sheet1 {

	public static void main(String[] args) {
		List<String> studentNames = new ArrayList<String>();
		studentNames.add("sandeep");
		studentNames.add("ajay");
		studentNames.add("adhiraj");
		studentNames.add("akhand");
		studentNames.add("rudra");
		studentNames.add("sandeep");

		System.out.println("Original Collection : " + studentNames);
		Collections.reverse(studentNames);
		System.out.println("After Collections.reverse(studentNames) : " + studentNames);
		Collections.shuffle(studentNames);
		System.out.println("After Collections.shuffle(studentNames) :" + studentNames);
		System.out.println("Occurance of specific element ('sandeep') in Collection : "
				+ Collections.frequency(studentNames, "sandeep"));
		

	}

}
