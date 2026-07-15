package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Employee;
import com.util.HibernateUtil;

public class ManyToOne {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
//		save(session);
		
		Employee employee = session.get(Employee.class, 101);
		Department department = session.find(Department.class, 1);
		
		System.out.println(department);
		System.out.println(employee);

		session.getTransaction().commit();
	}

	private static void save(Session session) {
//		Department department = new Department(1, "IT");

//		Employee emp1 = new Employee(101, "Srikar", 50000, department);
//		Employee emp2 = new Employee(102, "Rahul", 45000, department);
//
//		session.persist(emp1);
//		session.persist(emp2);
	}
}
