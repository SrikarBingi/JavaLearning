package com.hiberante;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Students st1 = new Students(2,"Srikar",59);
		
		session.beginTransaction();
		
		session.persist(st1);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
		
	}
}
