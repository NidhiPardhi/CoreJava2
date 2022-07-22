package com.rays.basics;

public class ArrayLength {
	
	public static void main(String[] args) {
		
		int [] arr= {2,4,6,8,10,12};
		
		for(int i=1;i<arr.length;i+=2) {
			
			System.out.println(arr[i]);
		}
		
	}

}