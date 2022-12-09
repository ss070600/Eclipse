package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmpApp4 {
	public static void main(String[] args) {

		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("empE.xml");
		// when above statement is executed then eager loading is attempted but in
		// empD.xml for bean id emp2 and constructor argument 1 there is no matching
		// argument in the Employee class so it will throw
		// org.springframework.beans.factory.UnsatisfiedDependencyException because it
		// will face java.lang.NumberFormatException while injecting dependency because
		// arg1 is "7405 3622 2983" and if there were no spaces in between the argument
		// string then it would have worked fine if that number was in the range of
		// instance variable id (of Employee).

		Employee obj1 = (Employee) appContext1.getBean("emp1");
		System.out.println(obj1);

	}
}
