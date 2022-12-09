package collectionstutotial;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set <String> hashSet = new HashSet<String>();
		hashSet.add("king");
		hashSet.add("gautam");
		hashSet.add("smith");
		hashSet.add("kochar");
		System.out.println(hashSet);
		hashSet.add("kochar");
		System.out.println(hashSet);
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
		
		

	}

}
