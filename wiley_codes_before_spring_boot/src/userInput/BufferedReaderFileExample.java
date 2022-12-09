package userInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileExample {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sandeep singh\\Desktop\\xyz.txt"));
		int i = reader.read();
		while (i != -1) {
			System.out.print((char) i);
			i = reader.read();
		}

	}
}
