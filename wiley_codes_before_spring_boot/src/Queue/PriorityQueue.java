package Queue;

import java.util.*;

public class PriorityQueue {
	static void testStringsNaturalOrdering() {
		java.util.Queue<String> testStringsPQ = new java.util.PriorityQueue<String>();
		testStringsPQ.add("abcd");
		testStringsPQ.add("1234");
		testStringsPQ.add("23bc");
		testStringsPQ.add("zzxx");
		testStringsPQ.add("abxy");

		System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
		while (!testStringsPQ.isEmpty()) {
			System.out.println(testStringsPQ.poll());
		}
	}

	public static void main(String[] args) {
		testStringsNaturalOrdering();

	}

}
