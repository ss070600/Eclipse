import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer2;

public class TestConfigApp5 {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CusAddConfigA.xml");
		Customer2 c = (Customer2) appContext.getBean("cus1234");
		System.out.println(c);

	}

}
