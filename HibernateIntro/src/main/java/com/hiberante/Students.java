package com.hiberante;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	private int studentId;
	private String name;
	private int marks;
	
	
	
	public Students(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	

	public Students() {
		super();
	}



	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}



	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
