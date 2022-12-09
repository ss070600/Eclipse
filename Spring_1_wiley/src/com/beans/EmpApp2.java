package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmpApp2 {
	public static void main(String[] args) {
		BeanFactory factContext = new XmlBeanFactory(new ClassPathResource("empA.xml"));
		System.out.println("Bean factory instansiated");
		Employee obj1 = (Employee) factContext.getBean("emp1"); // at this point the bean is getting loaded on
																// requirement
		System.out.println(obj1);

		ApplicationContext appContext = new ClassPathXmlApplicationContext("empA.xml");
		System.out.println("Application context loaded");

		Employee obj2 = (Employee) appContext.getBean("emp1");
		System.out.println(obj2);
		Employee obj3 = (Employee) appContext.getBean("emp2");
		System.out.println(obj3);

	}
}
