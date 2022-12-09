package Queue;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

class CustomIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 < o2 ? 1 : -1;
	}
}

public class PriorityQueueAndComparator {

	public static void main(String[] args) {
		Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
		testIntegersPQ.add(11);
		testIntegersPQ.add(5);
		testIntegersPQ.add(-1);
		testIntegersPQ.add(12);
		testIntegersPQ.add(6);

		System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
		while (!testIntegersPQ.isEmpty()) {
			System.out.println(testIntegersPQ.poll());
		}
	}

}
