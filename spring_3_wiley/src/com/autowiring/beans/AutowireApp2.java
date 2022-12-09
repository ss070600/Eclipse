package com.autowiring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp2 {

	// in this case autowire = "byType" is possible because at this time only one
	// bean of type department is defined in the xml file but the moment we define
	// another bean of type department then it will throw error on running the app
	// because spring will get confused like which department bean to pick as there
	// will be two of them in the xml file and if that is the case then we can
	// resolve it by using attribute primary="true" so this will let the spring know
	// that which dependency to inject when there are multiple bean definitions of
	// same type in the xml file.

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("EmpDeptB.xml");
		Employee obj = (Employee) appContext.getBean("emp1");
		System.out.println(obj.getName());
		System.out.println(obj.getDepartment().getName());

	}

}
