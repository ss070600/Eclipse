
public class FITest {

	public static void main(String[] args) {

		FunctionalInterfaceExample obj = () -> {
			System.out.println("xyz called !!!");
		};
		obj.xyz();
		
		System.out.println(obj.getClass().descriptorString());

	}

}
