package Assignment2;

class SavingsAccount {
	static private double annualInterestRate;
	private double savingsBalance;

	SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate / 100;
	}

	double getSavingsBalance() {
		return savingsBalance;
	}

	void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	void calculateMonthlyInterest() {
		double interest = this.getSavingsBalance() * (SavingsAccount.annualInterestRate);
		this.setSavingsBalance(this.getSavingsBalance() + interest);
		System.out.println("updated savings balance after adding monthly interest is : " + this.getSavingsBalance());
	}

	static void modifyAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate / 100;
	}
}

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount.setAnnualInterestRate(4);
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);

		System.out.println("saver1 initial savings balance is : " + saver1.getSavingsBalance());
		System.out.println("saver2 initial savings balance is : " + saver2.getSavingsBalance());

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("saver1 savings balance is : " + saver1.getSavingsBalance());
		System.out.println("saver2 savings balance is : " + saver2.getSavingsBalance());

		SavingsAccount.modifyAnnualInterestRate(5);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("saver1 savings balance is : " + saver1.getSavingsBalance());
		System.out.println("saver2 savings balance is : " + saver2.getSavingsBalance());
	}

}
