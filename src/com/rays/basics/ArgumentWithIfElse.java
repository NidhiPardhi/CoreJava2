package com.rays.basics;

public class ArgumentWithIfElse {
	
	public static void main(String[] args) {
		
		if(args.length==3) {
			
			System.out.println(args[0]+ " " +args[1]+" "+args[2]);
		}
		
		else {
			
			System.out.println("NOT");
		}
	}

}
