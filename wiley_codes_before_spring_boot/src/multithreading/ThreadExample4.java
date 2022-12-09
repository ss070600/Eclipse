package multithreading;

public class ThreadExample4 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		t.setName("Main method Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		Thread t1 = new Thread() {
			public void run() {System.out.println("T1 running");};
		};
		t1.start();

	}

}
