package SingletonClass;

class SingletonTwo {
	private static SingletonTwo single_instance = null;
	public String str;

	private SingletonTwo() {
		str = "hello i am private constructor";
		System.out.println(str);
	}

	// only synchronized keyword is added for making it synchronized
	public static synchronized SingletonTwo getInstance() {
		if (single_instance == null)
			single_instance = new SingletonTwo();
		return single_instance;
	}
}

public class SingletonThreadClassexample {

	public static void main(String[] args) {
		SingletonTwo obj1 = SingletonTwo.getInstance();
		SingletonTwo obj2 = SingletonTwo.getInstance();
		SingletonTwo obj3 = SingletonTwo.getInstance();
		if (obj1 == obj2 && obj2 == obj3)
			System.out.println("All objects points to same memory location... also the constructor is called only"
					+ "\none time. because only one single time the memory is allocated to single_instance"
					+ "\nobject which is being returned by getInstance() method.");
		else
			System.out.println("All objects doesn't points to same memory location...");
	}

}
