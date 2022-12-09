package collectionstutotial;

import java.util.ArrayList;
import java.util.List;

public class sheet2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sandeep");
		list.add("rudra");
		list.add("abhay");
		list.add("arunoday");
		list.add("adhiraj");
		System.out.println("original list is " + list);

		list.set(2, "priya");
		System.out.println("after list.set(2, \"priya\") : " + list);

		list.remove(2);
		System.out.println("after list.remove(2) : " + list);

		System.out.println("list.indexOf(\"sandeep\") : " + list.indexOf("sandeep"));
		System.out.println("list.size()" + list.size());
		System.out.println("list.contains(\"rudra\") : " + list.contains("rudra"));
		list.clear();
		System.out.println("after clear method");
		System.out.println("list.isEmpty() : " + list.isEmpty());

	}

}
