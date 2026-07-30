package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.Config;
import com.model.User;

public class Application {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
		        new AnnotationConfigApplicationContext(Config.class);
		
		User user = context.getBean("user", User.class);
		
		System.out.println(user);
	}
}
