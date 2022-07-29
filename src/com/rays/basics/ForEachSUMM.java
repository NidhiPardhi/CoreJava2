package com.rays.basics;

public class ForEachSUMM {
	
	public static void main(String[] args) {
		
		int []ary= {0,2,4,6};
		
		int sum=0;
       
		for(int i:ary) {
			
			System.out.println(i);
			
			sum = sum + i;
			
		}
		
		{ System.out.println("sum =" + sum);
		
	}
}
}