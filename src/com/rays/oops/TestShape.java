package com.rays.oops;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1=new Shape();
		
		s1.setColor("Red");
		s1.setBorderWidth(10);
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBorderWith());
		
		Shape s2=new Shape();
		
		s2.setColor("Blue");
		s2.setBorderWidth(20);
		
		System.out.println(s2.getColor());
		System.out.println(s2.getBorderWith());
	}
}
