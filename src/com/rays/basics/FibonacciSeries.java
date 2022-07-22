package com.rays.basics;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		int b = 0;
		
		int c = a+b;
		
		 for( a=0;a<=100;a++){
			
			System.out.println(a);
			
			c=a+b;
			
			a=b;
			
			b=c;	
			
		}
	}

}
