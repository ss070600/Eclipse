package multithreading;

// this program illustrates that main thread and t1 is running independently (see output it is mixed of both threads)

class FirstThread2 extends Thread {
	@Override
	public void run() {
		for(int i = 0;i<1000;i++) {
		System.out.println("First thread running");}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		FirstThread2 t1 = new FirstThread2();
		t1.start();
		for(int i= 0;i<1000;i++)
			System.out.println("Main thread running");
		

	}

}

