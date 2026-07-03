package com.nativequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Product;
import com.util.HibernateUtil;

import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

public class NativeQueriesOperations {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		insert(session);
		
//		update(session);
		
//		delete(session);
		
		selectAll(session);
	}

	private static void delete(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("delete from products where productId = 2");
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery("update products set name='table' where productId=2");
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createNativeMutationQuery(
			    "INSERT INTO products VALUES (2, 'Furniture', 'Sofa')"
			);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void selectAll(Session session) {
		NativeQuery<Product> query = session.createNativeQuery("select * from Products", Product.class);
		List<Product> products = query.getResultList();

        for (Product p : products) {
            System.out.println(p);
        }
	}
}
