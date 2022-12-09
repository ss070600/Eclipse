package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmpApp3 {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factContext = new XmlBeanFactory(new ClassPathResource("empA.xml"));
		System.out.println("Bean factory instansiated");
		Employee obj1 = (Employee) factContext.getBean("emp1");
		System.out.println(obj1);

		// ApplicationContext supports multiple bean descriptors while BeanFactory does
		// not supports this feature

		// as each of these empA, empB, empC are containing bean definitions with id
		// emp1 and emp2. so it raises a question that created beans will contain values
		// from which file or there will be any error. so answer is beans will be loaded
		// from the last processed file that is from empA in 1st case, (but not sure
		// about 2nd & 3rd case ?)
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("empB.xml", "empC.xml", "empA.xml");
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext(
				new String[] { "empC.xml", "empB.xml", "empA.xml" });
		ApplicationContext appContext3 = new ClassPathXmlApplicationContext(
				new String[] { "empC.xml", "empA.xml", "empB.xml" });
		System.out.println("Application context loaded");

		Employee obj2 = (Employee) appContext1.getBean("emp1");
		System.out.println(obj2);
		Employee obj3 = (Employee) appContext1.getBean("emp2");
		System.out.println(obj3);

		Employee obj4 = (Employee) appContext2.getBean("emp1");
		System.out.println(obj2);
		Employee obj5 = (Employee) appContext2.getBean("emp2");
		System.out.println(obj3);

		Employee obj6 = (Employee) appContext3.getBean("emp1");
		System.out.println(obj2);
		Employee obj7 = (Employee) appContext3.getBean("emp2");
		System.out.println(obj3);

	}
}
