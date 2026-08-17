package com.flm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flm.dao.EmployeeRepository;
import com.flm.dto.EmployeeRequestDTO;
import com.flm.dto.EmployeeResponseDTO;
import com.flm.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	private EmployeeResponseDTO convertToResponseDTO(Employee employee) {

	    return new EmployeeResponseDTO(
	            employee.getId(),
	            employee.getName(),
	            employee.getEmail(),
	            employee.getSalary(),
	            employee.getDepartment()
	    );
	}
	
	public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO request) {
		
		Employee employee = new Employee();
		
		employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setSalary(request.getSalary());
        employee.setDepartment(request.getDepartment());
        
        Employee savedEmployee = employeeRepository.save(employee);
        
        return new EmployeeResponseDTO(
                savedEmployee.getId(),
                savedEmployee.getName(),
                savedEmployee.getEmail(),
                savedEmployee.getSalary(),
                savedEmployee.getDepartment()
        ); 
	}
	
	public List<EmployeeResponseDTO> getAllEmployees(){
		List<Employee> employees = employeeRepository.findAll();
		
		return employees.stream()
				.map(employee->new EmployeeResponseDTO(
						employee.getId(),
						employee.getName(),
						employee.getEmail(),
						employee.getSalary(),
						employee.getDepartment()
						))
				.toList();
	}
	
	public EmployeeResponseDTO getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
	            .orElseThrow(() ->
	                    new RuntimeException(
	                            "Employee not found with id: " + id
	                    ));

	    return new EmployeeResponseDTO(
	            employee.getId(),
	            employee.getName(),
	            employee.getEmail(),
	            employee.getSalary(),
	            employee.getDepartment()
	    );
	}

	@Override
	public EmployeeResponseDTO updateEmployee(Long id,EmployeeRequestDTO request) {
		
		Employee employee = employeeRepository.findById(id)
	            .orElseThrow(() ->
	                    new RuntimeException(
	                            "Employee not found with id: " + id
	                    ));
		employee.setName(request.getName());
	    employee.setEmail(request.getEmail());
	    employee.setSalary(request.getSalary());
	    employee.setDepartment(request.getDepartment());
	    
	    Employee updatedEmployee = employeeRepository.save(employee);
	    
	    return new EmployeeResponseDTO(
                updatedEmployee.getId(),
                updatedEmployee.getName(),
                updatedEmployee.getEmail(),
                updatedEmployee.getSalary(),
                updatedEmployee.getDepartment()
        );
				
	}

	@Override
	public void deleteEmployee(Long id) {
		Employee employee = employeeRepository.findById(id)
	            .orElseThrow(() ->
	                    new RuntimeException(
	                            "Employee not found with id: " + id
	                    ));

	    employeeRepository.delete(employee);
	}
	@Override
	public List<EmployeeResponseDTO> getEmployeesByName(String name) {
		List<Employee> employees = employeeRepository.findByName(name);

	    return employees.stream()
	            .map(this::convertToResponseDTO)
	            .toList();
	}
}
