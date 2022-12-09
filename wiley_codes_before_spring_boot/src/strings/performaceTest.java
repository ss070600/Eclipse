package strings;

public class performaceTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("java");
		for (int i = 0; i < 10000; i++)
			stringBuffer.append("fundamentals");
		System.out.println("Performance Test (StringBuffer : " + (System.currentTimeMillis() - startTime));

		startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("java");
		for (int i = 0; i < 10000; i++)
			stringBuilder.append("fundamentals");
		System.out.println("Performance Test (StringBuilder : " + (System.currentTimeMillis() - startTime));

	}

}
