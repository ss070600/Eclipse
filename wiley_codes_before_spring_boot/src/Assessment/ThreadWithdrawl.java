package Assessment;

public class ThreadWithdrawl extends Thread {
	Bank obj;
	double withdrawlAmount;

	public ThreadWithdrawl(Bank obj, double withdrawlAmount) {
		super();
		this.obj = obj;
		this.withdrawlAmount = withdrawlAmount;
	}

	@Override
	public void run() {
		obj.withdrawl(obj.getBankName(), obj.getAccounHolderName(), withdrawlAmount);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("transaction complete!!");
		System.out.println("Remaining balance : "+obj.getInitialBalance());
	}
}
