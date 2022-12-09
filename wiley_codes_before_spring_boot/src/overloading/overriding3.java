package overloading;

abstract class Account {
	protected int accountNumber;
	protected String accountName;

	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	abstract void display();
}

abstract class Deposit extends Account {
	float amount;
	int maturity;
	String date;

	public Deposit(int accountNumber, String accountName, float amount, int maturity, String date) {
		super(accountNumber, accountName);
		this.amount = amount;
		this.maturity = maturity;
		this.date = date;
	}
}

class ShortTerm extends Deposit {
	int noOfMonths;

	public ShortTerm(int accountNumber, String accountName, float amount, int maturity, String date, int noOfMonths) {
		super(accountNumber, accountName, amount, maturity, date);
		this.noOfMonths = noOfMonths;
	}

	@Override
	public void display() {
		System.out.println("ShortTerm Details are ; ");
		System.out.println("account number : " + this.accountNumber);
		System.out.println("account name : " + this.accountName);
		System.out.println("amount : " + this.amount);
		System.out.println("maturity : " + this.maturity);
		System.out.println("date : " + this.date);
		System.out.println("number of months : " + this.noOfMonths);
	}
}

class LongTerm extends Deposit {
	int noOfYears;

	public LongTerm(int accountNumber, String accountName, float amount, int maturity, String date, int noOfYears) {
		super(accountNumber, accountName, amount, maturity, date);
		this.noOfYears = noOfYears;
	}

	@Override
	public void display() {
		System.out.println("LongTerm Details are ; ");
		System.out.println("account number : " + this.accountNumber);
		System.out.println("account name : " + this.accountName);
		System.out.println("amount : " + this.amount);
		System.out.println("maturity : " + this.maturity);
		System.out.println("date : " + this.date);
		System.out.println("number of Years : " + this.noOfYears);
	}
}

public class overriding3 {

	public static void main(String[] args) {
		ShortTerm obj1 = new ShortTerm(1, "sandeep", 2500.25f, 5, "27-nov-2022", 3);
		LongTerm obj2 = new LongTerm(2, "sandy", 25600.25f, 5, "27-nov-2022", 10);
		obj1.display();
		System.out.println();
		obj2.display();

	}

}
