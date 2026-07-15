package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Passport;
import com.entity.Person;
import com.util.HibernateUtil;

public class OneToOne {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();

//		save(session);
		
		fetch(session);

		session.close();
	}

	private static void fetch(Session session) {
		Person person = session.get(Person.class, 1);
		
		Passport passport = session.get(Passport.class, 1);
		
		System.out.println(person);
		System.out.println(passport);
		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassportNumber());
	}

	private static void save(Session session) {
		Passport passport = new Passport(1, "P123456");

		Person person = new Person(1, "Srikar", passport);

		session.persist(person);

		session.getTransaction().commit();
	}
}
