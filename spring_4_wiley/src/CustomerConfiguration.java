import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anno.bean.Customer2;
@Configuration
public class CustomerConfiguration {

	@Bean(name ="cus1234")
	public Customer2 myCustomer() {
		Customer2 c = new Customer2();
		return c;
	}
}
