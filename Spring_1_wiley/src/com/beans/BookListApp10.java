package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookListApp10 {

	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("BookListA.xml");
		LibraryList obj1= (LibraryList) appContext1.getBean("libraryList1");
		obj1.displayBooks();
	}

}
