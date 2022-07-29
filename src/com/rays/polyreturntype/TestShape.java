package com.rays.polyreturntype;

public class TestShape {
	public static void main(String[] args) {

		Rectangle r = (Rectangle) Shape.letShape(1);
		r.setColor("Blue");
		r.setLength(10);
		r.setWidth(5);

		System.out.println(r.area());

		Circle c = (Circle) Shape.letShape(2);
		c.setRadius(5);

		System.out.println(c.area());

		Triangle t = (Triangle) Shape.letShape(3);
		t.setBase(5);
		t.setHeight(10);

		System.out.println(t.area());

	}

}
