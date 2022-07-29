package com.rays.oops;

public class TestShapeee {
	
	public static void main(String[] args) {
		
		Shapeee s1 = new Shapeee("Black",40);
		System.out.println(s1.getColor()+" "+s1.getBorderWidth());
		 
		Shapeee s2 = new Shapeee("Blue",28,"Circle");
		System.out.println(s2.getColor()+"  "+s2.getSize()+"  "+s2.getType());
				}

}
