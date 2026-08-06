package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Employee emp) {
		sessionFactory.getCurrentSession().persist(emp);
	}
}
