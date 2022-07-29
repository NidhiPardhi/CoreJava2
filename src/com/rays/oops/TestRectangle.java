package com.rays.oops;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setColor("mAgEnDa");
		System.out.println("c is "+r.getColor());
		
		r.setBorderWidth(90);
		System.out.println("bw is "+r.getBorderWith());
		
		r.setLength(80);
		System.out.println("l = "+r.getLength());
		
		r.setWidth(50);
		System.out.println("w = "+r.getWidth());
		
		System.out.println("a = "+r.area());
	}

}
