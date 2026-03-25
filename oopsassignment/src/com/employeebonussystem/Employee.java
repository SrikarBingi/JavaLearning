package com.employeebonussystem;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	double calculateBonus() {
        return 0;
    }

    void displayDetails() {
        double bonus = calculateBonus();
        double totalSalary = salary + bonus;
        
        System.out.println("Employee id: "+empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------------");
    }
}
