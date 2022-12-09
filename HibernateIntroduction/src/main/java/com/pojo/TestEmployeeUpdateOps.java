package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployeeUpdateOps {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee(1, "sandeep", "singh chauhan", 50000.63);
		session.update(e1);
		System.out.println("employee updated!! ");
		transaction.commit();

		session.close();
		factory.close();

	}

}
