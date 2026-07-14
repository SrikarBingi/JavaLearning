package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarId;
import com.entity.Order;
import com.entity.Product;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
//		Order order = new Order(2,15,30);
		
//		Product product = new Product("Mobile","Electronics");
//		session.persist(order);
//		session.persist(product);
		

		CarId carId = new CarId(123,456);
		Car car = new Car(carId, "Altroz", "Tata",800000);
		
		session.persist(car);
		session.getTransaction().commit();
		
	}
}
