package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingNewFileExample {

	public static void main(String[] args)  {
		
		File file = new File("C:\\Users\\sandeep singh\\Desktop\\file handling\\file1.txt");
		try {
			if(file.createNewFile())
				System.out.println("File is created successfully.");
			else
				System.out.println("File already exists  in the directory.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}

}
