package com.employeebonussystem;

public class Developer extends Employee{
	
	Developer(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    @Override
    double calculateBonus() {
        return super.getSalary() * 0.10;
    }
}
