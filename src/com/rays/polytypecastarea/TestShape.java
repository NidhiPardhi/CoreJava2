package com.rays.polytypecastarea;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[]s=new Shape[3];
		
		s[0]= new Rectangle();
		s[1]= new Circle();
		s[2]= new Triangle();
		
		Rectangle r=(Rectangle)s[0];
		r.setLength(10);
		r.setWidth(5);
		System.out.println("rect area= "+r.area());
				
		Circle c= (Circle)s[1];
		c.setRadius(5);
		System.out.println("circle area = "+c.area());
		
		Triangle t= (Triangle)s[2];
		t.setBase(10);
		t.setHeight(7);
		System.out.println("Triangle area = "+t.area());
		
		double totalArea=0;
		
		for(int i=0;i<s.length;i++) {
			
			totalArea +=s[i].area();
			
		}
		System.out.println("Total ARea = "+totalArea);
	}

}
