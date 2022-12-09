package collectionstutotial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sheet3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sandeep");
		list.add("rudra");
		list.add("abhay");
		list.add("arunoday");
		list.add("adhiraj");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		int i = 0;
		while (i < list.size()) {
			System.out.print(list.get(i) + "  ");
			i++;
		}
		System.out.println();
		for (String str : list)
			System.out.print(str + "  ");

	}
}
