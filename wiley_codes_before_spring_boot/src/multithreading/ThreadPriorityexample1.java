package multithreading;

class PriorityCheckThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread name : " + Thread.currentThread().getName());
		System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
	}
}

public class ThreadPriorityexample1 {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		PriorityCheckThread t1 = new PriorityCheckThread();
		t1.setName("t1-thread");
		PriorityCheckThread t2 = new PriorityCheckThread();
		t2.setName("t2-thread");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println("---------------");
		t2.start();

		System.out.println("Main thread ended");

	}

}
