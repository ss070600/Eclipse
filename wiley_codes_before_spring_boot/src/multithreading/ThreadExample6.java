package multithreading;

class MyUserClass {
	public static void myMethod() {
		System.out.println("Hi, i am static method from MyUserClass");
	}
}

class MyUserThread extends MyUserClass implements Runnable {
	@Override
	public void run() {
		System.out.println("run method from MyUserThread called!!!");
	}
}

public class ThreadExample6 {
	// this code demonstrates that how implementing runnable interface is better
	// approach while doing multithreading because by this we can extend a class and
	// add multithreading functionality by implementing runnable interface.

	public static void main(String[] args) {
		MyUserThread t1 = new MyUserThread();
		t1.myMethod();
		Thread thread1 = new Thread(t1);
		thread1.start();

	}

}
