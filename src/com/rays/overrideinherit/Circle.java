package com.rays.overrideinherit;

public class Circle extends Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		System.out.println("Circle");
		return super.area() ;
		
	}

}
