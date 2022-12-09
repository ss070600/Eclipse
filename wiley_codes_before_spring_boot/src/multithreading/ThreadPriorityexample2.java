
package multithreading;

class ThreadA1 extends Thread {
	@Override
	public void run() {
		System.out.println("This is ThreadA");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("ThreadA is completed");
	}
}

class ThreadB1 extends Thread {
	@Override
	public void run() {
		System.out.println("This is ThreadB");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("ThreadB is completed");
	}
}

public class ThreadPriorityexample2 {

	public static void main(String[] args) {
		System.out.println("Main Thread started");
		ThreadA1 tA = new ThreadA1();
		ThreadB1 tB = new ThreadB1();

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
//		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);

		tA.setPriority(Thread.MIN_PRIORITY);
		tB.setPriority(Thread.MAX_PRIORITY);

		tA.start();
		//tA.yield();
		tB.start();
		System.out.println("Main thread ended");
	}

}
