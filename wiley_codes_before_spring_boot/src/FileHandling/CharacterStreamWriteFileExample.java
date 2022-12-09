package FileHandling;

import java.io.*;

/**
 * The Character streams writes the data into file character-wise based upon
 * unicode econding. i.e. 16 bits at a time. Thus, this is a much quicker
 * technique as compared to byte stream (8 bits at a time).
 */

public class CharacterStreamWriteFileExample {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("C:\\Users\\sandeep singh\\Desktop\\file handling\\file3.txt")) {
			writer.write("Hello Folks\n");
			writer.write("Here we writting with character stream.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("File written successfully !!");
	}

}
