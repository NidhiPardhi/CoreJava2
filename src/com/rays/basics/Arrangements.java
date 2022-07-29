package com.rays.basics;

public class Arrangements{
	
	public static void main (String [] args) {
		
		boolean condition  = true;
		
		int a =10;
		
		int b =20;
        
		int c = a+b;
				
		if(c<b) {

			System.out.println("sum is always lesser "+ c);
		}
		else {
			
			System.out.println("sum is always greater  " + c);
		}
		
		while(c>=b) {
			
			System.out.println(c-b);
			
			b++;
		}
	}
}