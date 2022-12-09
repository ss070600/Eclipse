package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp7 {
	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CarA.xml");
		Car obj1 = (Car) appContext1.getBean("car1");
		System.out.println(obj1);

		Car obj2 = (Car) appContext1.getBean("car1");
		System.out.println(obj2);

		Car obj3 = (Car) appContext1.getBean("car1");
		System.out.println(obj2);

		// singleton scope
		System.out.println(obj1.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println("So it's proved that same bean reference is getting returned if we "
				+ "\nare not specifying scope in xml file so by default it is using singleton scope");
		System.out.println(obj1 == obj2 && obj1 == obj3);

	}

}
