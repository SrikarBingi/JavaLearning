package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Employee;
import com.util.HibernateUtil;

public class OneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();

		session.beginTransaction();

//		save(session);
		
		fetch(session);
		
		session.getTransaction().commit();

		session.close();
	}

	private static void fetch(Session session) {
		Department dept = session.get(Department.class, 1);

		System.out.println("Department : " + dept.getName());

		for (Employee emp : dept.getEmployees()) {
		    System.out.println(emp.getName() + " " + emp.getSalary());
		}
	}

	private static void save(Session session) {
		Department dept = new Department();
		dept.setId(2);
		dept.setName("HR");

		Employee emp1 = new Employee(1, "Srikar", 50000);
		Employee emp2 = new Employee(2, "Rahul", 45000);

		// Set Department in Employee
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);

		// Add Employees to Department
		dept.setEmployees(List.of(emp1, emp2));

		session.persist(dept);
	}
}
