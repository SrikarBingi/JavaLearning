package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/save")
	public String save() {
		
		jdbcTemplate.update(
			    "INSERT INTO students VALUES (?, ?)",
			    1,
			    "Srikar"
			);
		
		return "saved";
	}
}
