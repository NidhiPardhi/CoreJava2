package com.rays.basics;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
	
		int[]a= {6,4,5,3,1,2};
		int[]b= {10,20,30,40,50,60};
	    String[]c= {"N","i","d","h","i"};
		Arrays.sort(a);
		for(int i:a) {
			
			System.out.print(i);
	
		}
		System.out.println("......");
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(c));
		
		
	    
	

}
}