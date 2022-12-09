package collectionstutotial;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> ts1 = new TreeSet<String>();

		ts1.add("sandeep");
		ts1.add("ajay");
		ts1.add("abhay");
		ts1.add("rudra");
		ts1.add("adhiraj");

		Iterator<String> itr = ts1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

}
