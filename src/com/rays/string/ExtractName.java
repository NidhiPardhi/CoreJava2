package com.rays.string;

public class ExtractName {
	
	public static void main(String[] args) {
		
		StringBuffer s= new StringBuffer(" Vijay Chouhan");
		
		s.delete(6, 12);
		
		System.out.println(s.delete(6,12));
		
		}

}
