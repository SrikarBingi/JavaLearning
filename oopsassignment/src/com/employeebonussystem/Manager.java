package com.employeebonussystem;

public class Manager extends Employee{
	
	Manager(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    @Override
    double calculateBonus() {
        return super.getSalary() * 0.20;
    }
}
