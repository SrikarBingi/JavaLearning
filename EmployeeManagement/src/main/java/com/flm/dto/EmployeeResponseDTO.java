package com.flm.dto;

public class EmployeeResponseDTO {
	
	private Long id;
    private String name;
    private String email;
    private double salary;
    private String department;

    public EmployeeResponseDTO() {
    }

    public EmployeeResponseDTO(
            Long id,
            String name,
            String email,
            double salary,
            String department) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
