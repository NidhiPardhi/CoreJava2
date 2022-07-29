package com.rays.constructorrr;

public class Shape {
	
	private String color;
	private int borderWidth;
	public static double PI=3.14;
	
	//default constructor to run in every class
	public Shape() {}
	
	public Shape(String color, int borderWidth) {
		
		this.color = color;
		this.borderWidth = borderWidth;
	}
	
	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}
	public static double getPI() {
		return PI;
	}

	public double area() {
		return area();
		
	}
	

}
