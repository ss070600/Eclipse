package collectionstutotial;

import java.util.*;

public class ArrayClassExample1 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 100, 20, 30, 40, 50 };
		Integer[] arr1 = { 10, 100, 20, 30, 40, 50 };
		Integer[] arr2 = { 10, 100, 20, 30, 40, 50 };
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		Arrays.sort(arr);
		System.out.println("after sorting arr is :");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("Arrays.binarySearch(arr, 100) : " + Arrays.binarySearch(arr, 100));
		System.out.println("Arrays.toString(arr) : " + Arrays.toString(arr));

		System.out.println("Arrays.copyOf(arr, 10) : " + Arrays.toString(Arrays.copyOf(arr, 10)));
		System.out.println("Arrays.copyOfRange(arr, 0, 3) : " + Arrays.toString(Arrays.copyOfRange(arr, 0, 3)));
		System.out.println("Arrays.equals(arr1,arr2) : " + Arrays.equals(arr1, arr2));
		Arrays.fill(arr, 0);
		System.out.println("after Arrays.fill(arr, 0) : " + Arrays.toString(arr));
	}

}
