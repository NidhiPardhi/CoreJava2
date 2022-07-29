package com.rays.constructorrr;

public class TestShape {
	public static void main(String[] args) {
		
		Shape []s=new Shape[3];
		s[0]= new Rectangle(10,5);
		s[1]= new Circle(2);
		s[2]= new Triangle(10,15);
		double totalArea = 0;
		
		for(int i=0;i<s.length;i++) {
			totalArea +=s[i].area();
			
			
		}
		System.out.println("Total area = "+totalArea);
		
		
	}

}
