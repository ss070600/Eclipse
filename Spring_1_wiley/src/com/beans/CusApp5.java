package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CusApp5 {

	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CusA.xml");
		Customer obj1 = (Customer) appContext1.getBean("cus1");
		System.out.println(obj1);


	}

}
