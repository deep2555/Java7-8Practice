package com.deepanshu.core.javaPractice.testSeries;


//  here i am defining the 2 class for the practice

// just normally define the class and find the radius

// class circle

class Circle {

	// field
	public double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

}

class Rectangle {

	public int length;
	public int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}

// class calculator to calculate the area of circle and rectangle
class Calculator {

	// here calculate the radius of the circle and rectangle
	public static void main(String[] args) {
		Circle cir = new Circle(2.5);
		Rectangle rec = new Rectangle(23, 44);
		
		// radius
		double cirRad = Math.PI * Math.pow(cir.radius, 2);
		double rectRad = rec.length * rec.breadth;
		
		System.out.println("the radius of circle is :"+ cirRad);
		System.out.println("the radius of rectangle is :"+ rectRad);

	}

}

public class TestSeries5 {

	public static void main(String[] args) {
		
	}
}
