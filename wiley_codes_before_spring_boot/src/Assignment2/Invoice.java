package Assignment2;

import java.io.Serializable;

public class Invoice implements Serializable {
	String partNumber, partDescription;
	int quantity;
	double price;

	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.setPartNumber(partNumber);
		this.setPartDescription(partDescription);
		this.setQuantity(quantity);
		this.setPrice(price);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0)
			this.quantity = quantity;
		else
			this.quantity = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
		else
			this.price = 0.0;
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

	public double getInvoiceAmount() {
		return this.getQuantity() * this.getPrice();
	}

	public void displayDetails() {
		System.out.println("Detail of spare part is >>> ");
		System.out.println("----------------------------------------------");
		System.out.println("Part number ; " + this.getPartNumber());
		System.out.println("Part description : " + this.getPartDescription());
		System.out.println("Quantity : " + this.getQuantity());
		System.out.println("Price per unit : " + this.getPrice());
	}
}
