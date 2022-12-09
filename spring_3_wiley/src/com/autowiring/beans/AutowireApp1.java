package com.autowiring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp1 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("EmpDeptA.xml");
		Employee obj = (Employee) appContext.getBean("emp1");
		System.out.println(obj.getName());
		System.out.println(obj.getDepartment().getName());

	}

}
