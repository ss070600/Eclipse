package Assessment;

public class Bank {
	private double initialBalance;
	private String bankName;
	private String accounHolderName;

	public Bank() {
		super();
	}

	public Bank(double initialBalance, String bankName, String accounHolderName) {
		super();
		this.initialBalance = initialBalance;
		this.bankName = bankName;
		this.accounHolderName = accounHolderName;
	}

	String getAccounHolderName() {
		return accounHolderName;
	}

	void setAccounHolderName(String accounHolderName) {
		this.accounHolderName = accounHolderName;
	}

	String getBankName() {
		return bankName;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	double getInitialBalance() {
		return initialBalance;
	}

	void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	@Override
	public String toString() {
		return "Bank [initialBalance=" + initialBalance + ", bankName=" + bankName + ", accounHolderName="
				+ accounHolderName + "]";
	}

	public void withdrawl(String bank, String name, double withdrawlAmount) {
		if (withdrawlAmount <= this.getInitialBalance()) {
			this.setInitialBalance(this.getInitialBalance() - withdrawlAmount);
		} else if (this.getInitialBalance() == 0.00) {
			System.out.println("no balance !!");
		} else {
			System.out.println("Try again with amount less than or equals to available balance");
		}

	}

	public void deposit(String bank, String name, double depositAmount) {
		double amount = this.getInitialBalance() + depositAmount;
		this.setInitialBalance(amount);
		System.out.println("Deposit successfull");
	}
}
