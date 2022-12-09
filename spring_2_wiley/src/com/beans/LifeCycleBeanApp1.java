package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeanApp1 {
	// also if we want we can use attributes init-method ="<methodName>" &
	// destroy-method ="<methodName>" in the bean declaration in xml file.

	// also we can use default-destroy-method ="<methodName>" &
	// default-init-method="<methodName>" so that they can be used as default
	// methods for all the beans in that xml file. provided they should be declared
	// at the top in the xml file i.e in parent bean tag
	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("LifeCycleA.xml");
		LifeCycleBean lcb = (LifeCycleBean) appContext1.getBean("life1");
		System.out.println("Bean loaded ...");
		((AbstractApplicationContext) appContext1).registerShutdownHook();// by this we are forcefully shutting spring
																			// container to see the execution of
																			// destroy()
	}
}
