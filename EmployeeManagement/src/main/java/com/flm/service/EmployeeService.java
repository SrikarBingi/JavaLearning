package com.flm.service;

import java.util.List;

import com.flm.dto.EmployeeRequestDTO;
import com.flm.dto.EmployeeResponseDTO;

public interface EmployeeService {
	
	EmployeeResponseDTO saveEmployee(EmployeeRequestDTO request);

    List<EmployeeResponseDTO> getAllEmployees();

    EmployeeResponseDTO getEmployeeById(Long id);
    
    EmployeeResponseDTO updateEmployee(Long id,EmployeeRequestDTO request);
    
    void deleteEmployee(Long id);
    
    List<EmployeeResponseDTO> getEmployeesByName(String name);
}
