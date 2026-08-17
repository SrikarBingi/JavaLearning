package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/save")
	public Employee save() {
		return employeeService.saveEmp();
	}
	
	@GetMapping("/find")
	public Employee getEmployee(@RequestParam(name="id") int id) {
		return employeeService.getEmployeeById(id);
	}
}
