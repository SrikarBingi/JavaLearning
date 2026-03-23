package com.studentgradesystem;

public class Student {
	
	private int studentId;
	private String name;
	private int marks;
	
	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	//calculate grade
	public String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }
	
	//displaying student details
	public void displayStudentDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }
}
