package userInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedReaderWithLoopFileExample {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String message = "";

		while (int i != -1) {
			System.out.print((char) i);
			i = reader.read();
		}

	}

}
