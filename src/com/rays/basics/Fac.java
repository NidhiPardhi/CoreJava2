package com.rays.basics;

public class Fac {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		int fact = 1;
		
		for(i=1;i<=10;i++) {
			
			fact = i*fact;
			
			System.out.println(fact);
		}
		
		System.out.println(" f = "+ fact);
	}

}