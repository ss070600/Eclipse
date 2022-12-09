package Assessment;

public class ThreadDeposit extends Thread {
	Bank obj;
	double depositAmount;

	public ThreadDeposit(Bank obj, double depositAmount) {
		super();
		this.obj = obj;
		this.depositAmount = depositAmount;
	}

	@Override
	public void run() {
		obj.deposit(obj.getBankName(), obj.getAccounHolderName(), depositAmount);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("transaction complete!!");
		System.out.println("new updated balance : " + obj.getInitialBalance());
	}
}
