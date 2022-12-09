class Array{
	private int[] array;
	private int count;
	
	public Array(int length) {
		array = new int[length];
		count = 0;
	}
	public void print() {
		for(int i = 0;i<count;i++)
			System.out.print(array[i]+" ");
	}
	public void insert(int item) {
		if(array.length==count) {
			int [] newArray = new int[2*count];
			for(int i = 0;i<array.length;i++) {
				newArray[i]=array[i];
			}
			array=newArray;
		}
		array[array.length]=item;
	}
	public void delete(int item) {
		for(int i = 0; i < array.length;i++) {
			if(array[i]==item) {
				for(int j = i;j<array.length-1;j++) {
					array[j]=array[j+1];
				}
			}
		}
	}
}

public class sheet1 {

	public static void main(String[] args) {

		
	}
}
