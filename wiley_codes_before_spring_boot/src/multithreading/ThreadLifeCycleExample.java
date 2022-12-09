package multithreading;

class ThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("This is ThreadA");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ThreadA is completed");
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("This is ThreadB");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("ThreadB is completed");
	}
}

public class ThreadLifeCycleExample {

	public static void main(String[] args) {
		System.out.println("Main Thread started");
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();

		tA.start();
		tA.yield();
		// here we called up first yield method then sleep method because if we will
		// directly put the threadA to sleep then it will go in to waiting state without
		// freeing up the resources that could have been used up by another threadB to
		// get executed if they were released before putting the threadA to sleep.

		// here in the output of this code it will not show any difference because our
		// processor is multicore currently but it will definitely show the difference
		// if
		// there were large no. of threads. or we were using single core processor.
		try {
			tA.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tB.start();
		System.out.println("Main thread ended");
	}

}
