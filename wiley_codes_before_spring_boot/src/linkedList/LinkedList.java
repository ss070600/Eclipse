package linkedList;

public class LinkedList {

	 class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	Node first;
	Node last;
	int size;

	public boolean hasLoop() {
		if (first == null) {
			return false;
		} else {
			var slow = first;
			var fast = first;

			do {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast)
					return true;
			} while (fast.next != null && fast.next.next != null);
			return false;
		}
	}

	public void printMiddle() {
		if (first == null) {
			System.out.println("List is empty");
		} else if (first.next == null) {
			System.out.println("Middle element is : " + first.value);
		} else {
			var slow = first;
			var fast = first;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.print("\nMiddle element is : " + slow.value);
			if(fast.next!=null)
				System.out.println(" and "+slow.next.value);
		}
	}

	// AddLast
	public void addLast(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}

	// AddFirst
	public void addFirst(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
		size++;
	}

	// isEmpty()
	public boolean isEmpty() {
		return first == null;
	}

	// removeLast()
	void removeLast() {
		Node temp = first;
		if (temp == null) {
			return;
		} else if (temp.next == null) {
			first = null;
			size--;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			size--;
		}
	}

	// removeFirst()
	public void removeFirst() {
		if (size == 0) {
			System.out.println("Empty");
		} else if (size == 1) {
			first = last = null;
			size = 0;
		} else {
			first = first.next;
			size--;
		}
	}

	// indexOf()
	public void indexOf(int val) {
		int index = 0;
		if (first == null) {
			System.out.println("The list is empty");
		} else {
			Node temp = first;
			while (temp != null) {
				if (temp.value == val) {
					System.out.println("The index of " + val + " is: " + index);
					break;
				}
				temp = temp.next;
				index++;
			}
		}
	}

	// contains()
	public boolean contains(int item) {
		Node temp = first;
		boolean contains = false;
		while (temp != null) {
			if (temp.value == item) {
				contains = true;
				break;
			}
			temp = temp.next;
		}
		return contains;
	}

	// size()
	public int size() {
		return size;
	}

	// convertToArray()
	public int[] convertToArray() {
		int[] array = new int[size];
		var current = first;
		var index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}

	// traversal()
	public void traversal() {
		Node temp = first;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

}
