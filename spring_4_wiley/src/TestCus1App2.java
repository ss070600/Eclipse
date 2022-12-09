

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer1;

public class TestCus1App2 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CusAddA.xml");
		Customer1 c = (Customer1) appContext.getBean("cus1");
		System.out.println(c);
	}

}
