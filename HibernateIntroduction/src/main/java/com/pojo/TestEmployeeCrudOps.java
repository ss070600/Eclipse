package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployeeCrudOps {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee(1, "sandeep", "singh", 50000.63);
		session.save(e1);
		Employee e2 = new Employee(2, "abhay", "singh", 63200.63);
		session.save(e2);
		Employee e3 = new Employee(3, "akshay", "singh", 600.63);
		session.save(e3);
		Employee e4 = new Employee(4, "rudra", "singh", 86200.63);
		session.save(e4);
		System.out.println("Employee saved in database");
		transaction.commit();

		transaction.begin();
		session.delete(e4);
		System.out.println("employee deleted");
		transaction.commit();

		transaction.begin();
		Employee e5 = session.get(Employee.class, 2);
		System.out.println("through get method : ");
		System.out.println(e5);
		transaction.commit();

		transaction.begin();
		Employee e6 = session.load(Employee.class, 2);
		System.out.println("through load method : ");
		System.out.println(e6);
		transaction.commit();

		transaction.begin();
		Employee e7 = new Employee(1, "sandeep", "singh chauhan", 50000.63);
		session.update(e7);
		System.out.println("employee updated!! ");
		transaction.commit();

		session.close();
		factory.close();

	}

}
