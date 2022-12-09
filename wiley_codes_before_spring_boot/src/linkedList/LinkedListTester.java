package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addLast(4);
		list.addLast(2);
		list.addFirst(5);
		list.addLast(6);
		list.addLast(1);
		list.addLast(7);
		list.addLast(5);
		list.addLast(3);
		list.addLast(8);
		list.addLast(1);

		System.out.print("list is : ");
		list.traversal();
		System.out.println();

		System.out.println("size is : " + list.size());

		System.out.print("\nwhen even no of elements are there in linkedlist : ");
		list.printMiddle();

		list.addFirst(56);
		System.out.print("\nwhen odd no of elements are there in linkedlist : ");
		list.printMiddle();
		System.out.println();

		System.out.println("\nlist1 hasLoop : " + list.hasLoop());
		// ---------------------------------------------------------------
		LinkedList list2 = new LinkedList();
		LinkedList.Node start = list2.new Node(5);
		start.next = start;

//		while(start.next !=null)
//			System.out.println("*");
		list2.first = start;

//		while(list2.first.next !=null)
//			System.out.println("*");
		System.out.println("list2 hasLoop : " + list2.hasLoop());
		// --------------------------------------------------------------
		LinkedList list3 = new LinkedList();

		LinkedList.Node one = list2.new Node(5);
		LinkedList.Node two = list2.new Node(5);
		LinkedList.Node three = list2.new Node(5);
		LinkedList.Node four = list2.new Node(5);
		LinkedList.Node five = list2.new Node(5);
		LinkedList.Node six = list2.new Node(5);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = two;

		list3.first = one;

//		while(list3.first.next !=null)
//			System.out.println("*");
		System.out.println("list2 hasLoop : " + list3.hasLoop());

		// --------------------------------------------------------------

	}

}