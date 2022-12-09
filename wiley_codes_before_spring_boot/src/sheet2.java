
public class sheet2 {

	public static void main(String[] args) {
		int x=5;
		if(x%5==0)
			System.out.println("divisible");
		else
			System.out.println("not divisible");
		
		String s = x%5==0?("divisible"):("not divisible");
		System.out.println(s);

	}

}
