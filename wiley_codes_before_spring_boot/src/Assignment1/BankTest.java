package Assignment1;

import java.util.Scanner;

/*
Define an interface IAccount and declare the methods getBalance, deposit and withdraw. Create two 
concrete classes named as HDFCAccount and StateBankAccount that implements IAccount interface. 
There  is difference between implementation of these classes, HDFCAccount uses member variables deposits and 
withdrawals for maintaining the balance, where as StateBankAccount uses only balance to maintain the balance. 
Test your application with creating objects of HDFCAccount and StateBankAccount. 
Don't forget to assign them the reference of the interface IAccount. 
The methods transactOnAccount and printBalance only know about the 
interface IAccount and does not getting impacted on which class's object is passed.
*/
interface IAccount {
	double getBalance();

	void deposit();

	void withdraw();
}

class HDFCAccount implements IAccount {

	private static double withDrawAmmount;
	private static double balanceToBeDeposited;
	private double balance;

	public HDFCAccount() {
		super();
	}

	public HDFCAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getWithDrawAmmount() {
		return withDrawAmmount;
	}

	public static void setWithDrawAmmount(double withDrawAmmount) {
		HDFCAccount.withDrawAmmount = withDrawAmmount;
	}

	public static double getBalanceToBeDeposited() {
		return balanceToBeDeposited;
	}

	public static void setBalanceToBeDeposited(double balanceToBeDeposited) {
		HDFCAccount.balanceToBeDeposited = balanceToBeDeposited;
	}

	@Override
	public void withdraw() {
		if (this.balance >= HDFCAccount.getWithDrawAmmount())
			this.balance -= HDFCAccount.getWithDrawAmmount();
		else if (this.balance == 0.0)
			System.out.println("InSufficient Balance");
		else
			System.out.println("InSufficient Balance in account to withdraw this amount...");
		System.out.println("Withdrawl transaction complete & current balance is : " + this.balance);
	}

	@Override
	public void deposit() {
		this.balance += HDFCAccount.getBalanceToBeDeposited();
		System.out.println("Balance deposited & current balance is : " + this.balance);
	}

}

class StateBankAccount implements IAccount {
	private double balance;

	public StateBankAccount() {
		super();
	}

	public StateBankAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void innerWithdrawl(double withdrawlAmmount) {
		if (this.balance >= withdrawlAmmount)
			this.balance -= withdrawlAmmount;
		else if (this.balance == 0.0)
			System.out.println("InSufficient Balance");
		else
			System.out.println("InSufficient Balance in account to withdraw this amount...");
		System.out.println("Withdrawl transaction complete & current balance is : " + this.balance);

	}

	public void innerDeposit(double amountToBeDeposited) {
		this.balance += amountToBeDeposited;
		System.out.println("Balance deposited & current balance is : " + this.balance);
	}

	@Override
	public void withdraw() {
		Scanner sco = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn : ");
		int amount = sco.nextInt();
		this.innerWithdrawl(amount);
		sco.close();
	}

	@Override
	public void deposit() {
		Scanner sco = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited : ");
		int amount = sco.nextInt();
		this.innerDeposit(amount);
		sco.close();
	}

}

class InValid implements IAccount {
	@Override
	public double getBalance() {
		return 0;
	};

	@Override
	public void deposit() {
	};

	@Override
	public void withdraw() {
	};

}

public class BankTest {
	static Scanner sc = new Scanner(System.in);

	public static void printBalance(IAccount object) {
		if (object instanceof HDFCAccount) {
			System.out.println("Instance of HDFCAccount is passed & balance is : " + object.getBalance());
		} else if (object instanceof StateBankAccount) {
			System.out.println("Instance of StateBankAccount is passed & balance is : " + object.getBalance());
		} else {
			System.out.println("Invalid Object Passed");
		}
	}

	public static void transactOnAccount(IAccount object) {

		System.out.println("Enter 1 for deposit & 2 for withdrawl");
		int choice1 = sc.nextInt();
		if (choice1 == 1) {

			if (object instanceof HDFCAccount) {
				System.out.println("Enter the amount to be deposited : ");
				int amount = sc.nextInt();
				HDFCAccount.setBalanceToBeDeposited(amount);
				object.deposit();
			} else if (object instanceof StateBankAccount) {
				object.deposit();
			} else {
				System.out.println("Invalid object passed ");
			}
		} else if (choice1 == 2) {

			if (object instanceof HDFCAccount) {
				System.out.println("Enter the amount to be withdrawl : ");
				int amount = sc.nextInt();
				HDFCAccount.setWithDrawAmmount(amount);
				object.withdraw();
			} else if (object instanceof StateBankAccount) {
				object.withdraw();
			} else {
				System.out.println("Invalid object passed ");
			}
		} else {
			System.out.println("Invalid Choice");
		}

	}

	public static void main(String[] args) {
		IAccount hdfc = new HDFCAccount(10000);
		IAccount sbi = new StateBankAccount(5000);
		IAccount invalid = new InValid();

		printBalance(hdfc);
		printBalance(sbi);
		printBalance(invalid);

		transactOnAccount(hdfc);
		transactOnAccount(sbi);
		transactOnAccount(invalid);

	}

}
