package com.rays.basics;

public class Fact2 {
	
	public static void main(String[] args) {
		
		int i;
		
		int n=10;
		
		int fact=1;
		
		for(i=2;i<=n;i++) {
			
			fact = fact*i;
			
			System.out.println("fact="+fact);
		}
		{
			System.out.println(fact);
		}
	}

}
