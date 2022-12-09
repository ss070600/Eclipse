package multithreading;

class FirstThread extends Thread {
	@Override
	public void run() {
		System.out.println("First thread running");
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread();
		t1.start(); // started thread life cycle and it will internally call overridden run method

		// t1.start(); // we can't start same thread more than one time cause it will
		// give java.lang.IllegalThreadStateException cause thread life cycle started
		// when we called it for the first time

		// we can call run method directly multiple times from Thread class because by
		// this
		// statement we are just calling run method of Thread class but we are not
		// actually starting the life cycle of thread as like in t1.start().
		t1.run();
		t1.run();
		t1.run();
		t1.run();

	}

}
