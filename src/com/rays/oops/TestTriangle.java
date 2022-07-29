package com.rays.oops;

public class TestTriangle {
	public static void main(String[] args) {
		
		Triangle t= new Triangle();
		t.setColor("Wine");
		System.out.println("color..."+t.getColor());
		
		t.setBorderWidth(70);
		System.out.println("bw...."+t.getBorderWith());
		
		t.setBase(15);
		System.out.println("base...."+t.getBase());
		
		t.setHeight(10);
		System.out.println("height....."+t.getHeight());
		
		System.out.println("area......"+t.area());
		
	}

}
