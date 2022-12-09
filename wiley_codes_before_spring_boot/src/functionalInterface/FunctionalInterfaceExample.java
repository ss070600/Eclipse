package functionalInterface;

@FunctionalInterface
interface Printer {
	void print(String message);
}

public class FunctionalInterfaceExample {
	String msg = "hello folks";
	static String xx = "sandeep";

	public static void main(String[] args) {
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
		obj.msg = "pppp";
		String y = "bbb";
		// lambda having access to static, local, instance variables.
		Printer p = (x) -> System.out.println(xx + x + y + obj.msg);
		p.print("sandy");

	}

}
