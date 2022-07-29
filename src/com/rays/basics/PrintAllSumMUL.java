package com.rays.basics;

public class PrintAllSumMUL {
	
	public static void main(String[] args) {
		
		printAll(args);
		
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		int sum= a+b;
		
		System.out.println(sum);
	}
	
	public static void printAll(String[]args) {
		
		for(int i=0;i<args.length;i++) {
			
			System.out.println("SAY "+ args[i]);
		}
		
		Mathh l = new Mathh();
		
		l.sum();
		l.sub();
		l.mult();
	}

}
