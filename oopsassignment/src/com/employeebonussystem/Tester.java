package com.employeebonussystem;

public class Tester extends Employee{
	
	Tester(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    @Override
    double calculateBonus() {
        return super.getSalary() * 0.05;
    }
}
