package com.employeebonussystem;

public class Main {
	public static void main(String[] args) {
		Employee m = new Manager(1, "Rahul", 100000);
        Employee d = new Developer(2, "Srikar", 80000);
        Employee t = new Tester(3, "Anjali", 60000);

        m.displayDetails();
        d.displayDetails();
        t.displayDetails();
	}
}
