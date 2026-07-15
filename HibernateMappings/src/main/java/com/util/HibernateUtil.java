package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Department;
import com.entity.Employee;
import com.entity.Passport;
import com.entity.Person;
import com.entity.Student;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Person.class);
			cfg.addAnnotatedClass(Passport.class);
			cfg.addAnnotatedClass(Employee.class);
			cfg.addAnnotatedClass(Department.class);
			cfg.addAnnotatedClass(Course.class);
			cfg.addAnnotatedClass(Student.class);
			
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
	}
}
