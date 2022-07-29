package com.rays.polyreturntype;

public class Shape {
	private String color;
	private int borderWidth;
	public static final double PI = 3.14;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public double area() {
		return area();

	}

	public static Shape letShape(int i) {
		if (i == 1) {
			return new Rectangle();
		}
		if (i == 2) {
			return new Circle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return null;

	}

}