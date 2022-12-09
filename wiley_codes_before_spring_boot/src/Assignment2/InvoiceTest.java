package Assignment2;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("10135", "KTM spark plug", 2, 56.30);
		Invoice invoice2 = new Invoice("10135", "KTM spark plug", -2, -56.30);

		invoice1.displayDetails();
		System.out
				.println("Total amount for " + invoice1.getPartDescription() + " is : " + invoice1.getInvoiceAmount());
		System.out.println();
		invoice2.displayDetails();
		System.out
				.println("Total amount for " + invoice2.getPartDescription() + " is : " + invoice2.getInvoiceAmount());

	}

}
