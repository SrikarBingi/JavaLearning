package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.EmployeeRequestDTO;
import com.flm.dto.EmployeeResponseDTO;
import com.flm.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<EmployeeResponseDTO> saveEmployee(@RequestBody EmployeeRequestDTO request){
		EmployeeResponseDTO response =
                employeeService.saveEmployee(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
	}
	
	@GetMapping("/allEmployees")
	public ResponseEntity<List<EmployeeResponseDTO>> getAllEmployees(){
		List<EmployeeResponseDTO> employees =
	            employeeService.getAllEmployees();

	    return ResponseEntity.ok(employees);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeResponseDTO> getEmployeeById(@PathVariable Long id){
		EmployeeResponseDTO response =
                employeeService.getEmployeeById(id);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<EmployeeResponseDTO>> getEmployeesByName(
	        @RequestParam String name) {

	    return ResponseEntity.ok(
	            employeeService.getEmployeesByName(name)
	    );
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeResponseDTO> updateEmployee(
	        @PathVariable Long id,
	        @RequestBody EmployeeRequestDTO request) {

	    EmployeeResponseDTO response =
	            employeeService.updateEmployee(id, request);

	    return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(
	        @PathVariable Long id) {

	    employeeService.deleteEmployee(id);

	    return ResponseEntity.noContent().build();
	}
}
