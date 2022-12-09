package collectionstutotial;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Integer> hashSet1 = new HashSet<Integer>();
		Set<Integer> hashSet2 = new HashSet<Integer>();

		hashSet1.add(101);
		hashSet1.add(102);
		hashSet1.add(103);
		hashSet1.add(104);
		hashSet1.add(105);

		hashSet2.add(106);
		hashSet2.add(107);
		hashSet2.add(103);
		hashSet2.add(104);
		hashSet2.add(105);
		System.out.println("hashSet 1 : " + hashSet1);
		System.out.println("hashSet 2 : " + hashSet2);

		Set<Integer> union = new HashSet<Integer>(hashSet1);
		union.addAll(hashSet2);
		System.out.println("union : " + union);

		Set<Integer> intersection = new HashSet<Integer>(hashSet1);
		intersection.retainAll(hashSet2);
		System.out.println("intersection : " + intersection);

		Set<Integer> difference = new HashSet<Integer>(hashSet1);
		difference.removeAll(hashSet2);
		System.out.println("difference : " + difference);

	}
}
