package com.deepanshu.core.javaPractice.testSeries;

// abstract and interface practice

abstract class Shape {

	abstract void calculateArea();
}

class Circles extends Shape {
	private final double radius;

	public Circles(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	void calculateArea() {
		// pi (r) square
		double result = Math.PI * Math.pow(radius, 2);
		System.out.println("the radius is :" + result);

	}

}

class Square extends Shape {

	private final double side;

	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	void calculateArea() {
	
		double reu = Math.pow(side,2);
		System.out.println("the side of circle is: "+ reu);

	}

}

public class TestSeries7 {

	public static void main(String[] args) {
		
		Circles cir = new Circles(5);
		Square sq = new Square(2);
		
		cir.calculateArea();
		sq.calculateArea();
	}
}
