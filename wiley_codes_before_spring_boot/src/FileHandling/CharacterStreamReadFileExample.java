package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamReadFileExample {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("C:\\Users\\sandeep singh\\Desktop\\file handling\\file3.txt")) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
