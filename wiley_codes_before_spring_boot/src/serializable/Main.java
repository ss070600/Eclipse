package serializable;

import java.io.*;

import Employee;
// employee extends class person (which is serializable)
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(101, "sanadeep", "intern", 50000.0f);
		FileOutputStream outStream = new FileOutputStream("C:\\\\Users\\sandeep singh\\Desktop\\xyz.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(employee);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("employee object serialized successfully");

		FileInputStream inStream = new FileInputStream("C:\\\\Users\\sandeep singh\\Desktop\\xyz.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		Employee obj = (Employee) in.readObject();
		System.out.println(obj);
		System.out.println("employee object deserialized successfully");
		in.close();
		inStream.close();

	}

}
