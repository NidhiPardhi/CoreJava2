package com.rays.trycatchh;

public class TryCatchh {
	
	public static void main(String[] args) {
		
		int k=0;
		
		int i=20;
		
		System.out.println("Before Exception");
		
		try{
			
			double div=i/k; //Divide by zero
			
			System.out.println("Division = "+div);
		}
		catch(Exception e) {
			
			System.out.println("After Exception");
			
		}
		
		}

}
