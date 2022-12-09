package Assessment;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("main thread started ");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bank Name : ");
		String bName = sc.next();
		System.out.println("Enter account holder name : ");
		String accountHolderName = sc.next();
		sc.nextLine();
		System.out.println("Enter initial Balance : ");
		double initialBalance = sc.nextDouble();

		Bank bank = new Bank(initialBalance, bName, accountHolderName);
		System.out.println("\nYour initial bank details are : ");
		System.out.println(bank);
		System.out.println();

		System.out.println("Enter withdrawl amount : ");
		double amount = sc.nextDouble();

		ThreadWithdrawl threadWithdrawl = new ThreadWithdrawl(bank, amount);
		threadWithdrawl.start();

		while (true) {
			if (threadWithdrawl.isAlive() == false) {
				System.out.println("\nthreadWithdrawl.isAlive() : " + threadWithdrawl.isAlive());
				System.out.println();
				
				System.out.println("Enter deposit amount : ");
				amount = sc.nextDouble();

				ThreadDeposit threadDeposit = new ThreadDeposit(bank, amount);
				threadDeposit.start();
				break;
			}
		}

		System.out.println("main thread ended ");
	}

}
