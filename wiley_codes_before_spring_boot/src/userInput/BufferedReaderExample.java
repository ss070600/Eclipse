package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String name = reader.readLine();
		System.out.println("Your name is : " + name);
		System.out.println("Enter your age : ");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("your ager is : " + age);

	}

}
