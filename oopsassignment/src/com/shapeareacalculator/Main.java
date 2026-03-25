package com.shapeareacalculator;

public class Main {
	public static void main(String[] args) {

        Shape shape = new Shape();

        // Square
        shape.calculateArea(5);

        // Rectangle
        shape.calculateArea(10, 4);

        // Circle
        shape.calculateArea(3.5);
    }
}
