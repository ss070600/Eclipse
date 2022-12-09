package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

class Array {

	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
		count = 0;
	}
	public int size() {
		return items.length;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.print(items[i] + " ");
		}
	}

	public void insert(int item) {
		if (items.length == count) {
			int[] newItems = new int[count * 2];
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			items = newItems;
		}
		items[count++] = item;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}

	public int max() {
		if (count == 0)
			throw new IllegalStateException();
		else {
			int max = items[0];
			for (int i : items) {
				if (i > max)
					max = i;
			}
			return max;
		}
	}

	public int[] intersect(int[] arr) {
		if (arr.length == 0) {
			throw new NoSuchElementException();
		} else {
			int counter = items.length < arr.length ? items.length : arr.length;
			List<Integer> list1 = Arrays.stream(items).boxed().collect(Collectors.toList());
			List<Integer> list2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
			List<Integer> list3 = new ArrayList<Integer>();
			for (Integer i : list1)
				if (list2.contains(i)) {
					list3.add(i);
				}
			int[] result = new int[list3.size()];
			int index = 0;
			for (Integer i : list3) {
				result[index++] = i;
			}
			return result;
		}
	}

	public void reverse() {
		int i = 0, j = count-1;
		int temp;
		while (i < j) {
			temp = items[i];
			items[i] = items[j];
			items[j] = temp;
			i++;
			j--;
		}
	}

	public void insertAt(int item, int index) {
		if (items.length == count) {
			int[] newItems = new int[count * 2];
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			items = newItems;
		}
		if (index >= count) {
			items[count++] = item;
		} else {
			for (int i = count; i > index; i--) {
				items[i] = items[i - 1];
			}
			items[index] = item;
			count++;
		}
	}

}
