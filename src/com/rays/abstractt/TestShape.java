package com.rays.abstractt;

public class TestShape {
	public static void main(String[] args) {

		Shape s = new Rectangle();
		s.setColor("Blue");
		s.setBorderWidth(10);
		// s.area();

		Rectangle r = (Rectangle) s;
		r.setLength(10);
		r.setWidth(20);
		System.out.println(s.area());
		
		Shape s1= new Circle();
		
		Circle c=(Circle)s1;
		c.setRadius(5);
		System.out.println(s1.area());
		
		Shape s2=new Triangle();
		
		Triangle t= (Triangle)s2;
		t.setBase(5);
		t.setHeight(10);
		System.out.println(s2.area());
		
		System.out.println(s.area()+s1.area()+s2.area());

	}

}
