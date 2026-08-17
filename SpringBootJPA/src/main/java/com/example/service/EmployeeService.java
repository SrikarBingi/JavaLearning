package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmp() {
		Employee emp = new Employee("Srikar",10000);
		return employeeRepository.save(emp);
	}
	
	public Employee getEmployeeById( int id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	
}
