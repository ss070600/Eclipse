package com.demo;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	// @private HibernateTransactionManager transaction;
	public void save() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		// Transaction tx=session.beginTransaction();
		User u1 = new User(105, "Dave", "Dykes", "dave@gmail.com");
		session.save(u1);
		// tx.commit();
		// session.close();

	}

}