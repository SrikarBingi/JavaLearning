package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.dao.EmployeeDao;
import com.model.Employee;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
		
		Employee emp = new Employee("Srikar", 10000);
		
		employeeDao.save(emp);
	}
}
