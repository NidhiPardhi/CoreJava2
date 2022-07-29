package com.rays.oops;

public class Circle extends Shape {
	
	private int radius = 15;
	private static final double PI=3.14;
	
	public void setRadius(int r) {
		int radius=r;
	}
	public int getRadius() {
		return radius;
	}	
    public static double getPi() {
			return PI;
	}
	public double area() {
		double a= PI*radius*radius;
		return a;
		
	
	}
}
