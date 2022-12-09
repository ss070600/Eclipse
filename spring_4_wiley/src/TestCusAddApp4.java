import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer2;

public class TestCusAddApp4 {

	// 1st case :
	// in this in the customer2 class the address field has name 'customerAddress'
	// that is being autowired and this works fine if any bean with id
	// ="customerAddress" is present in the CusAddB.xml and it doesn't matter that
	// if any no. of beans are present of same type address because it if it finds
	// the bean with id equals to the property name then it will autowire that
	// without any error

	// 2nd case :
	// now if there is a case that there is no bean with id equals to the property
	// name is present in the xml file and also no other bean of type address is
	// present in the xml file then it will work fine and the bean created by spring
	// for class Address with id ="address" will be autowired to customerAddress

	// 3rd case :
	// now if there is a case that there is no bean with id equals to the property
	// name is present in the xml file but other bean of type address is
	// present in the xml file then it will not work fine. because spring will get
	// confused between (the bean created by spring for class Address with id
	// ="address") & (the other bean of type address that is present in xml file)
	// because in this case spring will try to autowire by default as byType but as
	// it will find two beans of type address so it will throw error as expected 1
	// found 2 beans of type address

	// 4th case :
	// now in the 3rd case to make it work fine besides the thing that there is no
	// bean in the xml file with id = property name (ie. customerAddress) and there
	// are two beans of type Address (one because of @Component on Address class &
	// one defined in xml file manually) then to eliminate the confusion that which
	// bean to pick as both are of type Address because spring by default will try
	// to auto wire with byType but will fail because there are two beans of type
	// address, we can use @Qualifier Annotation with customerAddress in class
	// Customer2 and mention value = id of bean that you want to be injected
	// without creating any confusion to spring.

	// 5th case :
	// also if there is no bean in the xml file with id = property name (ie.
	// customerAddress) and there are two beans (one because of @Component on
	// Address class & one defined in xml file with id ="address "manually) then it
	// will work fine because the bean created due to @Component on class Address
	// will be created with id = "address" (in lowercase) and the bean that you
	// created normally in xml file with id = "address" will simply override that
	// bean that was created due to @Component on class Address

	// 6th case: also one point is that when there is a case when there is confusion
	// due to types then we can use attribute primary="true" with bean in the xml
	// file or we can use @primary annotation in the class only, both things will
	// work fine (note : @Primary is used with methods that returns beans so it is
	// used in combination with @Bean) also (note : @primary is used with classes
	// with @Component when a two or more classes implements same interface and and
	// overrides same method of that interface then it is used to eliminate
	// confusion)

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("CusAddB.xml");
		Customer2 c = (Customer2) appContext.getBean("cus101");
		System.out.println(c);

	}

}
