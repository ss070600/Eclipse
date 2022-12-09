package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmpApp1 {

	public static void main(String[] args) {
		// BeanFactory and ApplicationContext both are used to create beans and their
		// are significant differences between them

		// BeanFactory is lazy loaded means , the moment we instantiate this
		// XmlBeanFactory class
		// then for all the beans defined in the xml file empA.xml their constructors
		// will be called and respective values will be loaded in the respective
		// instance variables of those beans i.e all the dependencies will be injected
		// at requirement only i.e when we create beans using this XmlBeanFactory
		// instance then respective beans will be loaded (in this case it is setter
		// injection but we can use constructor injection also if we want depending on
		// our business requirement)
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("empA.xml"));
		System.out.println("Bean factory instansiated");

		// ApplicationContext is eagerly loaded means , the moment we create this
		// application context
		// then for all the beans defined in the xml file empA.xml their constructors
		// will be called and respective values will be loaded in the respective
		// instance variables of those beans i.e all the dependencies will be injected
		// at that time only (but in bean factory dependencies are injected on
		// requirement only) -- (in this case it is setter injection but we can use
		// constructor injection also if we want depending on our business requirement)
		ApplicationContext context = new ClassPathXmlApplicationContext("empA.xml");
		System.out.println("Application context loaded");

	}

}
