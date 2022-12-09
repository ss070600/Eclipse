package multithreading;

import java.util.*;



class FirstThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("First thread running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		FirstThread3 t1 = new FirstThread3();
		t1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main thread running");
			Thread.sleep(999);
		}

	}

}
