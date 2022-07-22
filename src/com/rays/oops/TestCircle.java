package com.rays.oops;

public class TestCircle {
	
	public static void main(String[] args) {
	       
		Circle c= new Circle();
		
		c.setColor("Lavender");
		System.out.println("color....."+c.getColor());
		
		c.setBorderWidth(20);
		System.out.println("bw......."+c.getBorderWith());
		
		c.setRadius(15);
		System.out.println("radius......"+c.getRadius());
		
		System.out.println("pie = "+c.getPi());
		
		System.out.println("Area......"+c.getPi()+"*"+c.getRadius()+"*"+c.getRadius()+"="+c.area());
				
	}

}
