package stack;

public class MinStackTest {
	public static void main(String[] args) {
		MinStack s = new MinStack();

		s.push(15);
		s.push(23);
		s.min();
		s.push(12);
		s.push(3);
		s.min();
		s.pop();
		s.min();
		s.pop();
		s.peek();
	}
}
