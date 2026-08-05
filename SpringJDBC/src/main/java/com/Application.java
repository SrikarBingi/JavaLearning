package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.dao.StudentDAO;
import com.model.Student;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDAO dao = context.getBean(StudentDAO.class);

        // INSERT
        Student s1 = new Student(101, "John");

        System.out.println("Inserted : " + dao.insert(s1));

        // UPDATE
        Student s2 = new Student(101, "John Smith");

        System.out.println("Updated : " + dao.update(s2));

        // SELECT ONE
        System.out.println(dao.getStudent(101));

        // SELECT ALL
        dao.getAllStudents().forEach(System.out::println);

        // COUNT
        System.out.println("Count = " + dao.countStudents());

        // DELETE
        System.out.println("Deleted : " + dao.delete(1));
	}
}
