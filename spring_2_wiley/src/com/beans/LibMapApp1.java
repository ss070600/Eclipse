package com.beans;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibMapApp1 {
	public static void main(String[] args) {
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("LibMap1.xml");
		LibraryMap obj1 = (LibraryMap) appContext1.getBean("libMap1");
		obj1.displayBooks();
	}
}
