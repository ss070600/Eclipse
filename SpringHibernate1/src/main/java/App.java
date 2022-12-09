import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.UserService;
import com.demo.UserServiceImpl;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userservice = context.getBean("userServiceImpl", UserServiceImpl.class);
		userservice.save();

	}

}