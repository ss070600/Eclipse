package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//** important
// car Factory illustration
public class CarFacApp9 {
	public static void main(String[] args) {
//		CarFactory cf = new CarFactory();
//		Car2 c = cf.buildCar();
//		System.out.println(c);

		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CarFacA.xml");
		Car2 c = (Car2) appContext1.getBean("carobj");
		System.out.println(c);

	}

}
