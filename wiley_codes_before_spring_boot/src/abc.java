
public class abc {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		final String c = new String("hello");
		String d = new String("hello");

		System.out.println(a.hashCode());
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		
	}

}
