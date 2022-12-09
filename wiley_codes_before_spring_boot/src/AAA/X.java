package AAA;

import java.io.IOException;

public class X implements ABC {
	public void msg() {
		System.out.println("abc");
	}

	public static void main(String[] args) {

		X obj = new X();
		obj.msg();

	}

}
