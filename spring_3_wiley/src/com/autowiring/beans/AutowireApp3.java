package com.autowiring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp3 {
	// when we use byName autowiring approach then the id of the bean in the xml
	// file should match with the property name (i.e instance variable name like in
	// this case it is 2nd instance variable "department" in the Employee class)
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("EmpDeptC.xml");
		Employee obj = (Employee) appContext.getBean("emp1");
		System.out.println(obj.getName());
		System.out.println(obj.getDepartment().getName());

	}
}
