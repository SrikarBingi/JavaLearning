package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.Product;
import com.util.HibernateUtil;

public class HQLOperations {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		insert(session);
		
//		selectAll(session);
		
//		update(session);
		
		delete(session);
		
		
	}

	private static void delete(Session session) {
		session.beginTransaction();

		MutationQuery query = session.createMutationQuery(
		    "delete from Product p where p.productId = :id"
		);

		query.setParameter("id", 2);

		query.executeUpdate();

		session.getTransaction().commit();

		session.close();
	}

	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery(
			    "update Product p set p.name = :name where p.productId = :id"
			);

			query.setParameter("name", "Dining");
			query.setParameter("id", 3);
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("insert into Product ( id, name, category) values (?1, ?2, ?3)");
		query.setParameter(1, 3);
		query.setParameter(2, "Sofa");
		query.setParameter(3, "Furniture");
		query.executeUpdate(); 
		session.getTransaction().commit();
	}

	private static void selectAll(Session session) {
		SelectionQuery<Product> query = session.createSelectionQuery("Select p from Product p", Product.class);
		List<Product> productList = query.list();
		System.out.println(productList);
	}
}
