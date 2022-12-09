package collectionstutotial;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<String> lhs1 = new LinkedHashSet<String>();
		Set<String> lhs2 = new LinkedHashSet<String>();

		lhs1.add("sandeep");
		lhs1.add("ajay");
		lhs1.add("abhay");
		lhs1.add("rudra");
		lhs1.add("adhiraj");
		
		Iterator <String> itr = lhs1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}

}
