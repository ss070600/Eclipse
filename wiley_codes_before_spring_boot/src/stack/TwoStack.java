package stack;

class TwoStack {
	int size;
	int top1, top2;
	int arr[];

	TwoStack(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	void push1(int x) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack1 Overflow");
		}
	}

	void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack2 Overflow");
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack1 Underflow");
		}
		return Integer.MIN_VALUE;
	}

	int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("Stack2 Underflow");
		}
		return 0;
	}

	public static void main(String args[]) {
		TwoStack twoStacks = new TwoStack(5);
		twoStacks.push1(5);
		twoStacks.push2(10);
		twoStacks.push2(15);
		twoStacks.push1(11);
		twoStacks.push2(7);
		
		twoStacks.push1(7);
		twoStacks.push2(7);
		System.out.println("Popped element from" + " stack1 is " + twoStacks.pop1());
		twoStacks.push2(40);
		System.out.println("Popped element from" + " stack2 is " + twoStacks.pop2());
	}
}
//This code has been contributed by
//Amit Khandelwal(Amit Khandelwal 1).
