package oops;

public class sheet3 {
	String name;
	String city;
	String country;

	sheet3() {
		this.name = "sandeep";
		this.city = "Lucknow";
		this.country = "India";
	}

	sheet3(String country) {
		this();
		this.country = country;
	}

	sheet3(String city, String country) {
		this();
		this.city = city;
		this.country = country;
	}

	public void displayDetails() {
		System.out.println("Details are >");
		System.out.println(this.name);
		System.out.println(this.city);
		System.out.println(this.country);
	}

	public static void main(String[] args) {
		sheet3 obj1 = new sheet3();
		obj1.displayDetails();
		sheet3 obj2 = new sheet3("Russia");
		obj2.displayDetails();
		sheet3 obj3 = new sheet3("Texas", "USA");
		obj3.displayDetails();

	}

}
