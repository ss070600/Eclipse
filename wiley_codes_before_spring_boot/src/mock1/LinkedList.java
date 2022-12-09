package mock1;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void addFirst(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	void addLast(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(data);
	}

	void addInMiddleAfterData(int data, int value) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			if (temp.data == data) {
				Node x = new Node(value);
				x.next = temp.next;
				temp.next = x;
				return;
			}
			temp = temp.next;
		}
		Node x = new Node(value);
		temp.next = x;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	int getSize() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	void delete(int data) {
		if (head == null)
			return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				if (temp.next.next != null)
					temp.next = temp.next.next;
				else
					temp.next = null;
				break;
			}
			temp = temp.next;
		}
	}

	void deleteBeg() {
		head = head.next;
	}

	void deleteLast() {
		Node temp = head;
		if (temp == null) {
			return;
		} else if (temp.next == null) {
			head = null;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	boolean lookUpByValue(Node head, int data) {
		if (head == null)
			return false;
		if (head.data == data)
			return true;
		return lookUpByValue(head.next, data);
	}

	Node nthNode(Node head, int n) {
		if (head == null)
			return null;
		if (n == 1)
			return head;
		return nthNode(head.next, n - 1);
	}

	int lookUpByIndex(Node head, int index) {
		int size = this.getSize();
		Node x;
		if (index > size - 1) {
			throw new IndexOutOfBoundsException();
		} else {
			x = nthNode(head, index + 1);
		}
		return x.data;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addFirst(1);
		list.addFirst(0);
		list.addFirst(-1);
		list.addFirst(-2);

		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);

		list.addInMiddleAfterData(1, 2);
		list.addInMiddleAfterData(2, 3);

		System.out.print("list is : ");
		list.printList();
		System.out.println();
		list.deleteLast();
		System.out.print("after deleteLast list is : ");
		list.printList();
		System.out.println();
		list.deleteBeg();
		System.out.print("after deleteBeg list is : ");
		list.printList();
		System.out.println();
		list.delete(3);
		System.out.print("after delete(3) list is : ");
		list.printList();
		System.out.println();

		System.out.println();

		System.out.println("get value with index 2: " + list.lookUpByIndex(list.head, 2));
		System.out.println("if contains a particular value (6): " + list.lookUpByValue(list.head, 6));

	}

}
