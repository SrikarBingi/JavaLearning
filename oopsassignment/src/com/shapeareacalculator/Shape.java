package com.shapeareacalculator;

public class Shape {
	
	//Area of square
	public void calculateArea(int side) {
		System.out.println("Area of square is: "+side*side);
	}
	
	//area of rectangle
	public void calculateArea(int length, int breadth) {
		System.out.println("Area of rectangle is: "+ length*breadth);
	}
	
	//area of circle
	public void calculateArea(double radius) {
		System.out.println("Area of circle is: "+Math.PI*radius*radius);
	}
}
