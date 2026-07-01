package com.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;

public class EmployeeServices {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
//		insert(session);
		
//		update(session);
		
//		fetch(session);

		delete(session);
		
		session.close();
		sessionFactory.close();
	}

	private static void delete(Session session) {
		session.beginTransaction();
		Employee emp = session.get(Employee.class, 1);
		if(emp!=null) {
			session.remove(emp);
			System.out.println("Removed successfully");
		}
		else {
			System.out.println("Employee not found");
		}
		session.getTransaction().commit();
	}

	private static void fetch(Session session) {
		Employee employee = session.get(Employee.class, 1);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found");
        }
	}

	private static void update(Session session) {
		session.beginTransaction();
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
            employee.setSalary(60000);
            System.out.println("Employee Updated Successfully");
        } else {
            System.out.println("Employee Not Found");
        }
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		Employee emp1 = new Employee(1, "Srikar", 25000);
		
		session.beginTransaction();
		session.persist(emp1);
		session.getTransaction().commit();
	}
}
