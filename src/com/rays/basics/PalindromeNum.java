package com.rays.basics;

public class PalindromeNum {
       
	public static void main(String[] args) {
		
		int i=1331;
		int num=i;
		int j=0;
		int temp=0;
		
		while(i>0){
			
			j=i%10;
			temp=(temp*10)+j;
			
			//System.out.print(j+" ");
			
			i=i/10;
		}
			if (num==temp){
				
				System.out.println(num + " is palindrome num");
			}
			else{
				
				System.out.println(num+  " is not palindrome num");
			}
				
		}
		
		
		
	
}


