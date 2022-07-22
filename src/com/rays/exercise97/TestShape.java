package com.rays.exercise97;

public class TestShape {
	
	public static void main(String[] args) {
		
  Shape[]s= new Shape[3] ;
  
   s[0]= new Rectangle();
   s[1]= new Circle();
   s[2]= new Triangle();
   
   Rectangle r= (Rectangle) s[0];
   
   Circle c = (Circle) s[1];
    
   Triangle t=(Triangle) s[2];


  System.out.println(s[0].area(12, 10)+s[1].area(10)+s[2].area(13,10 ));
  
  }
}
