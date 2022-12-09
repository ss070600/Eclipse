package com.autowiring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDeptApp4 {
	//autowiring using type as constructor
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("EmpDeptD.xml");
		Employee obj = (Employee) appContext.getBean("emp1");
		System.out.println(obj.getName());
		System.out.println(obj.getDepartment().getName());

	}
}
