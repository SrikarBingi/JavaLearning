package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		
		User user = container.getBean("user", User.class);
		
		User user2 = container.getBean("user2", User.class);
		
		System.out.println(user);
		System.out.println(user2);
	}
}
