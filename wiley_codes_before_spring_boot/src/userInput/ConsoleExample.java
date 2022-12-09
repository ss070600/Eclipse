package userInput;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("enter username : ");
		String username = console.readLine();
		System.out.println("your username is : " + username);
	}

}
