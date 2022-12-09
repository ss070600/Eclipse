package userInput;

import java.util.StringTokenizer;

public class TokenizingExample {

	public static void main(String[] args) {
		StringTokenizer message = new StringTokenizer("my name is sandeep singh chauhan");
		// by default it uses white spaces as delimiter
		while (message.hasMoreTokens()) {
			System.out.println(message.nextToken());
		}

	}

}
