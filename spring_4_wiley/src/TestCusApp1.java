

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

public class TestCusApp1 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CusAddA.xml");
		Customer c = (Customer) appContext.getBean("customer");
		System.out.println(c);
	}

}
