package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.util.HibernateUtil;

public class ManyToMany {
	
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
		Student student = session.get(Student.class, 1);

		System.out.println(student.getName());

		for (Course course : student.getCourses()) {
		    System.out.println(course.getName());
		}
	}

	private static void save(Session session) {
		Course java = new Course(101,"Java");
		Course hld = new Course(102,"HLD");
		
		Student s1 = new Student(1, "Srikar", List.of(java,hld));
		Student s2 = new Student(2, "Pranathi", List.of(java));
		
		java.setStudents(List.of(s1,s2));
		hld.setStudents(List.of(s1));
		
		session.persist(s1);
		session.persist(s2);
	}
}
