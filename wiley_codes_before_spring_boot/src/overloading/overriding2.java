package overloading;

abstract class ManageAccount {
	public abstract void openAccount();

	public abstract void closeAccount();

	public static void welcomeMessage() {
		System.out.println("welcome to abc bank");
	}
}

abstract class BankAccount extends ManageAccount {
	public abstract void deposit();

	public abstract void withdraw();

	public abstract void balance();
}

class SavingsAccount extends BankAccount {
	@Override
	public void deposit() {
		System.out.println("savings deposit");
	}

	@Override
	public void withdraw() {
		System.out.println("savings withdraw");
	}

	@Override
	public void balance() {
		System.out.println("savings balance");
	}

	@Override
	public void openAccount() {
		System.out.println("savings openAccount");
	}

	@Override
	public void closeAccount() {
		System.out.println("savings closeAccount");
	}
}

class CurrentAccount extends BankAccount {
	@Override
	public void deposit() {
		System.out.println("current deposit");
	}

	@Override
	public void withdraw() {
		System.out.println("current withdraw");
	}

	@Override
	public void balance() {
		System.out.println("current balance");
	}

	@Override
	public void openAccount() {
		System.out.println("current openAccount");
	}

	@Override
	public void closeAccount() {
		System.out.println("current closeAccount");
	}
}

public class overriding2 {

	public static void main(String[] args) {
		SavingsAccount obj1 = new SavingsAccount();
		CurrentAccount obj2 = new CurrentAccount();

		obj1.welcomeMessage();
		obj1.deposit();
		obj1.withdraw();
		obj1.balance();
		obj1.openAccount();
		obj1.closeAccount();

		obj2.welcomeMessage();
		obj2.deposit();
		obj2.withdraw();
		obj2.balance();
		obj2.openAccount();
		obj2.closeAccount();

	}

}
