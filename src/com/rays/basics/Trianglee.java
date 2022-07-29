package com.rays.basics;

public class Trianglee {
	
	public static void main(String[] args) {
		
		
		
		int[][]t=new int [5][5];
		
		for(int i = 1;i<t.length;i++) {
			
			for(int j=1;j<=i;j++) {
				
				t[i][j]=i;
				
				System.out.print(t[i][j]+"  ");
			}
			
			System.out.println();
		}
			
			
	}}

