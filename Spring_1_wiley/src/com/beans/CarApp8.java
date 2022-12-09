package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp8 {
	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CarB.xml");
		Car obj1 = (Car) appContext1.getBean("car1");
		System.out.println(obj1);

		Car obj2 = (Car) appContext1.getBean("car1");
		System.out.println(obj2);

		Car obj3 = (Car) appContext1.getBean("car1");
		System.out.println(obj3);

		// singleton scope

		System.out.println("Demo for scope ='prototype'");
		System.out.println(obj1.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println("So you can see that hascode are still same because of their default implementation"
				+ " but they are not actually equal because there memory references are different");
		System.out.println("\nmemory reference comparison result : " + (obj1 == obj2 && obj1 == obj3));

	}

}
