package SingletonClass;

class Singleton {
	private static Singleton single_instance = null;
	public String str;

	private Singleton() {
		str = "hello i am private constructor";
		System.out.println(str);
	}

	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}
}

public class SingletonClassExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		if (obj1 == obj2 && obj2 == obj3)
			System.out.println("All objects points to same memory location... also the constructor is called only"
					+ "\none time. because only one single time the memory is allocated to single_instance"
					+ "\nobject which is being returned by getInstance() method.");
		else
			System.out.println("All objects doesn't points to same memory location...");
	}

}
