package com.rays.basics;

public class IntegerArrayLargest {

	public static void main(String[] args) {
		
		int [] a={10,20,30,40,50};
		
		int b=a[0];
		int c=0;
		for(int i=1;i<a.length;i++){
			
				
				if (b<a[i]){
					c=b;
					b=a[i];
				}
				
				
		
	
			}System.out.println(b + " is  largest & sec lar is "+c);
	}
}
