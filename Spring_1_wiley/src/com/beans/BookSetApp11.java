package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookSetApp11 {

	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("BookSetA.xml");
		LibrarySet obj1 = (LibrarySet) appContext1.getBean("librarySet1");
		obj1.displayBooks();
		System.out.println("you can see book5 is not in Set because it is same as book4");
	}

}
