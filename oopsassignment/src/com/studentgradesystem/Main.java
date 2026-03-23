package com.studentgradesystem;

public class Main {
	public static void main(String[] args) {
		
		 Student[] students = new Student[5];

	     students[0] = new Student(1, "Srikar", 85);
	     students[1] = new Student(2, "Ravi", 72);
	     students[2] = new Student(3, "Anu", 58);
	     students[3] = new Student(4, "Kiran", 40);
	     students[4] = new Student(5, "Priya", 30);
	     
	     for(int i=0;i<students.length;i++) {
	    	 students[i].displayStudentDetails();
	     }

	}
}
