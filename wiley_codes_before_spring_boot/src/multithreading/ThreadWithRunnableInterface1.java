package multithreading;

class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("MyThread is running");
	}
}

public class ThreadWithRunnableInterface1 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread thread1 = new Thread(t1);
		thread1.start();
	}

}
