package Assessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InvoiceTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Invoice invoice1 = new Invoice("10135", "KTM spark plug", 2, 56.30);
		Invoice invoice2 = new Invoice("10135", "KTM spark plug", -2, -56.30);
		Invoice invoice3 = new Invoice("10135", "KTM spark plug", 2, 56.30);
		Invoice invoice4 = new Invoice("10135", "KTM spark plug", -2, -56.30);
		Invoice invoice5 = new Invoice("10135", "KTM spark plug", 2, 56.30);

		invoice1.displayDetails();
		System.out.println("Total amount for " + invoice1.getPartDescription() + " is : " + invoice1.getInvoiceAmount());
		System.out.println();
		invoice2.displayDetails();
		System.out.println("Total amount for " + invoice2.getPartDescription() + " is : " + invoice2.getInvoiceAmount());

		FileOutputStream outStream = new FileOutputStream("C:\\Users\\sandeep singh\\Desktop\\file handling\\xyz.txt");
		ObjectOutputStream out = new ObjectOutputStream(outStream);
		out.writeObject(invoice1);
		out.flush();
		out.close();
		outStream.close();
		System.out.println("\nObject serialized successfully");

		FileInputStream inStream = new FileInputStream("C:\\Users\\sandeep singh\\Desktop\\file handling\\xyz.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);
		Invoice invoiceObject = (Invoice) in.readObject();
		invoiceObject.displayDetails();
		in.close();
		inStream.close();
		System.out.println("Object deserialized successfully");

		Invoice[] invoiceArray = new Invoice[5];
		invoiceArray[0] = invoice1;
		invoiceArray[1] = invoice2;
		invoiceArray[2] = invoice3;
		invoiceArray[3] = invoice4;
		invoiceArray[4] = invoice5;

		for (int i = 0; i < invoiceArray.length; i++) {
			System.out.println(invoiceArray[i]);
		}

		FileOutputStream outStream2 = new FileOutputStream(
				"C:\\Users\\sandeep singh\\Desktop\\file handling\\xyz2.txt");
		ObjectOutputStream out2 = new ObjectOutputStream(outStream2);
		out2.writeObject(invoiceArray);
		out2.flush();
		out2.close();
		outStream2.close();
		System.out.println("\nArray Object serialized successfully");

		FileInputStream inStream2 = new FileInputStream("C:\\Users\\sandeep singh\\Desktop\\file handling\\xyz2.txt");
		ObjectInputStream in2 = new ObjectInputStream(inStream2);
		Invoice[] invoiceArrayObject = (Invoice[]) in2.readObject();
		for (int i = 0; i < invoiceArrayObject.length; i++) {
			System.out.println(invoiceArrayObject[i]);
		}
		in2.close();
		inStream2.close();
		System.out.println("Array Object deserialized successfully");

	}

}
