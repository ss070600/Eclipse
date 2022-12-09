package stack;

import java.util.Stack;

class MinStack {
	Stack<Integer> s;
	Integer minElement;

	MinStack() {
		s = new Stack<Integer>();
	}

	void min() {
		if (s.isEmpty())
			System.out.println("Stack is empty");

		else
			System.out.println("Minimum Element in the " + " stack is: " + minElement);
	}

	void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty ");
			return;
		}
		Integer t = s.peek();
		System.out.print("Top Most Element is: ");

		if (t < minElement)
			System.out.println(minElement);
		else
			System.out.println(t);
	}


	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer t = s.pop();

		if (t < minElement) {
			System.out.println(minElement);
			minElement = 2 * minElement - t;
		}
		else
			System.out.println(t);
	}

	void push(Integer x) {
		if (s.isEmpty()) {
			minElement = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		if (x < minElement) {
			s.push(2 * x - minElement);
			minElement = x;
		}

		else
			s.push(x);

		System.out.println("Number Inserted: " + x);
	}
}
