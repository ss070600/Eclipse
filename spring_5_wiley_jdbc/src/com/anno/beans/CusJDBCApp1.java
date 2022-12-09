package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CusJDBCApp1 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("jdbcApp1.xml");
		CustomerDAO customerDAO = (CustomerDAO)appContext.getBean("customerDAOImpl");
		Customer c1 = new Customer(1,"akshay");
		int ans = customerDAO.add(c1);
		if(ans>0)
			System.out.println("record added successfully");
		
//		int ans = customerDAO.updateName(1,"abc");
//		if(ans>0)
//			System.out.println("record updated successfully");
		
//		int ans = customerDAO.delete(1);
//		if(ans>0)
//			System.out.println("record deleted successfully");
		

	}

}
