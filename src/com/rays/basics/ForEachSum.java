package com.rays.basics;

public class ForEachSum {
	
	public static void main(String[] args) {
		
		int [] arr = {11,22,33,44,55,66,77};
		
		int sum = 0;
		
		for(int i:arr) {
			
			System.out.println(sum+i);
			
			sum = sum +i;
		}
		{ 
			System.out.println(sum);
		}
		
		
	}

}
