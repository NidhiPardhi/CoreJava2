package com.rays.oops;

public class TestPen {
	public static void main(String[] args) {
		
		Pen p = new Pen("PINK","Ball Point Pen");
	
	
	    System.out.println(p.getColor());
	    System.out.println(p.getType());
	    
	    Pen p1 = new Pen(40);
	    
	    System.out.println(p1.getSpeed()+" wpm");
	}
	    
	    

}
