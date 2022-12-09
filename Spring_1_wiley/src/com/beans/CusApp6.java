package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CusApp6 {
	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("CusB.xml");
		Customer obj1 = (Customer) appContext1.getBean("cus1");
		System.out.println(obj1);


	}
}
