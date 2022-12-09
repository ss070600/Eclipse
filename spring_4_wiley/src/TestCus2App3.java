import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.anno.bean.Customer2;

public class TestCus2App3 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CusAddA.xml");
		Customer2 c = (Customer2) appContext.getBean("cus101");
		System.out.println(c);
		
	}

}
