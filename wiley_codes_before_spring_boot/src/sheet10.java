
public class sheet10 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		System.out.println(sum);

		int i = 0;
		sum = 0;
		while (i < array.length) {
			sum += array[i];
			i++;
		}
		System.out.println(sum);
		sum = 0;
		for (int value : array) {
			sum += value;
		}
		System.out.println(sum);

	}

}
