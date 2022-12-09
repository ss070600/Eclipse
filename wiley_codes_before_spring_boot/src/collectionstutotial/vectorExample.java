package collectionstutotial;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorExample {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.addElement("sandeep");
		vector.addElement("ajay");
		vector.addElement("abhay");
		vector.addElement("rudra");
		vector.addElement("adhiraj");
		System.out.println(vector);

		System.out.println("iterating vector");
		for (int i = 0; i < vector.size(); i++)
			System.out.print(vector.get(i) + "  ");
		System.out.println();
		for (String i : vector)
			System.out.print(i + "  ");

		System.out.println();
		int i = 0;
		while (i < vector.size()) {
			System.out.print(vector.get(i) + " ");
			i++;
		}
		System.out.println();
		Iterator<String> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("iterating stopped");

		Enumeration<String> enumeration = vector.elements();
		System.out.println("vector elements are : ");
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}

	}

}
