package com.rays.polymorphismm;

public class HomeLoan {
	public static void main(String[] args) {
		
		Bank []b= new Bank[3];
		b[0]=new AxisBank();
		b[1]=new HDFCBank();
		b[2]=new ICICIBank();
		
		for(Bank B:b) {
			
			System.out.println(B.getName()+" = "+B.interestRate());	
		}
		
			
	}
}
