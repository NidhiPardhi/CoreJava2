package com.rays.overrideinherit;

public class TestShape {
	public static void main(String[] args) {
	
	Shape s=new Shape();
	s.area();
	
	Shape s1= new Circle();
	s1.area();
	
	Shape s2= new Rectangle();
	s2.area();
	
	Shape s3= new Triangle();
	s3.area();
	
	Circle c= new Circle();
	c.area();
	
	Triangle t=new Triangle();
	t.area();
	
	Rectangle r= new Rectangle();
	r.area();
	
	Shape s4= new Rectangle();
	Rectangle r4=(Rectangle)s4;
	r4.area();
	s4.area();
	
	Shape s5= new Circle();
	s5.area();
}
}