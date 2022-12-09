package overloading;

interface IManageAccount {
	void openAccount();

	void closeAccount();
}

interface IBankAccount {
	public static void welcomeMessage() {
		System.out.println("welcm to abc ");
	}

	public default void defaultWelcomeMessage() {
		System.out.println("default : welcm to abc ");
	}

	void deposit();

	void withdraw();

	void balance();
}

class SavingAccountHere implements IBankAccount, IManageAccount {
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

public class interface1 {

	public static void main(String[] args) {
		SavingAccountHere obj1 = new SavingAccountHere();
		obj1.defaultWelcomeMessage();
		IBankAccount.welcomeMessage();
		obj1.deposit();
		obj1.withdraw();
		obj1.balance();
		obj1.openAccount();
		obj1.closeAccount();
	}

}
