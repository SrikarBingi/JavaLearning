package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.entity.Order;
import com.entity.Product;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Order.class);
			cfg.addAnnotatedClass(Product.class);
			cfg.addAnnotatedClass(Car.class);
			
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
	}

}
