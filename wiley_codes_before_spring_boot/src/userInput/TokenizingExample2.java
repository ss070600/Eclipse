package userInput;

import java.util.StringTokenizer;

public class TokenizingExample2 {
	public static void main(String[] args) {
		StringTokenizer message1 = new StringTokenizer("my,name,is,sandeep,singh,chauhan", ",");
		StringTokenizer message2 = new StringTokenizer("a,b,c,d", ",");
		StringTokenizer message3 = new StringTokenizer("aa,bb,cc,dd", ",", true);
		StringTokenizer message4 = new StringTokenizer("aa,bb,cc,dd", ",", false);
		StringTokenizer message5 = new StringTokenizer("my,name,is,sandeep,singh,chauhan", ",");
		StringTokenizer message6 = new StringTokenizer("my,name,is,sandeep,singh,chauhan", ",");
		System.out.println("Message 1 > \n ------------------------------------------------------");
		while (message1.hasMoreTokens()) {
			System.out.print(message1.nextToken() + " | ");
		}
		System.out.println();
		System.out.println("Message 2 > \n ------------------------------------------------------");
		System.out.println(message2.nextToken());
		System.out.println("Message 3 > \n ------------------------------------------------------");
		while (message3.hasMoreTokens()) {
			System.out.print(message3.nextToken() + " | ");
		}
		System.out.println();
		System.out.println("Message 4 > \n ------------------------------------------------------");
		while (message4.hasMoreTokens()) {
			System.out.print(message4.nextToken() + " | ");
		}
		System.out.println();
		System.out.println("Message 5 > \n ------------------------------------------------------");
		System.out.println(message5.countTokens());
		System.out.println("Message 6 > \n ------------------------------------------------------");
		int message6TokenCount = message6.countTokens();// storing this because message.countTokens value will keep on
														// decreasing as we access more tokens through nextToken method.
		for (int i = 0; i < message6TokenCount; i++) {
			System.out.println("Token at " + (i + 1) + " > " + message6.nextToken());
		}

	}
}
