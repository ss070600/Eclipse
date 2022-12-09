package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
			// below line creates new Empty File if it doesn't exists
			FileOutputStream outStream = new FileOutputStream(
					"C:\\Users\\sandeep singh\\Desktop\\file handling\\file2.txt");
			Writer writer = new OutputStreamWriter(outStream);
			try {
				writer.write("my name is sandeep singh\n");
				writer.write("i am a good boy");
				writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("File written successfully !!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
