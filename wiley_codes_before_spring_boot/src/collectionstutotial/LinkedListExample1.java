package collectionstutotial;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("x");
		list1.add("y");
		list1.add("z");

		LinkedList<String> list = new LinkedList<String>();
		list.add("sandeep");
		list.add("adhiraj");
		list.add("rudra");
		list.addFirst("ajay");
		list.addLast("abhay"); // by default it adds in last

		System.out.println(list);
		list.addFirst("akshay");
		System.out.println(list);
		list.addAll(list1);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		// list.removeAll(list);
		System.out.println(list);
		list.add("adhiraj");
		list.removeFirstOccurrence("adhiraj");
		System.out.println(list);
		list.removeLastOccurrence("adhiraj");
		System.out.println(list);
		list.poll();
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);

		list.add("sandeep");
		list.add("adhiraj");
		list.add("rudra");
		list.addFirst("ajay");
		list.addLast("abhay");
		System.out.println(list);

		System.out.println("iterating");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "  ");

		for (String i : list)
			System.out.print(i + "  ");

		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
