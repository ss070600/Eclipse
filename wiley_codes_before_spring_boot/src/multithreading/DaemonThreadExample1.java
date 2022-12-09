package multithreading;

class MyDaemonThread implements Runnable {
	@Override
	public void run() {
		System.out.println("run called");
	}
}

public class DaemonThreadExample1 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		Thread childThread = new Thread() {
			public void run() {
				System.out.println("Child Thread Running");
			};
		};
		//mainThread.setDaemon(true); // if we try to execute this statement then we will get
									// java.lang.IllegalThreadStateException because we can't set main thread as
									// Daemon as it is set non daemon by JVM.
		childThread.setDaemon(true);
		System.out.println("mainThread.isDaemon() : " + mainThread.isDaemon());
		System.out.println("childThread.isDaemon() : " + childThread.isDaemon());

		MyDaemonThread t1 = new MyDaemonThread();
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true);
		System.out.println("thread1.isDaemon() : " + thread1.isDaemon());
	}

}
