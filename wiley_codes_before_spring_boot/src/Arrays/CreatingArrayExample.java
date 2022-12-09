package Arrays;

public class CreatingArrayExample {

	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		// numbers.removeAt(10);

		System.out.println("Array size is : " + numbers.size());
		System.out.print("Array is : ");
		numbers.print();

		System.out.println("\nmax : " + numbers.max());

		System.out.print("Intersection is : ");
		for (Integer i : numbers.intersect(new int[] { 20, 30, 70 })) {
			System.out.print(i + " ");
		}

		System.out.print("\nReverse is : ");
		numbers.reverse();
		numbers.print();
		
		numbers.insertAt(74,23);
		numbers.insertAt(45, 3);
		System.out.print("\nArray is : ");
		numbers.print();

	}

}