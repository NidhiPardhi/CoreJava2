package com.rays.basics;

public class While {

	public static void main(String[] args) {

		int i = 1;

		int sum = 0;

		while (i <= 100) {

            System.out.println("Hello"+ i);  
			
			sum = sum + i;

			i++;
 
			System.out.println("Total = " + sum);
		}


	}

}
