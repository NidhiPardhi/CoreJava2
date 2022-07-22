package com.rays.basics;

public class PrintAllArg {

	public static void main(String[] args) {

		printAll(args);

	}

	public static void printAll(String[] args) {

		for (int i = 0; i < args.length; i++) {

			System.out.println("they are = " + args[i]);
		}
	}
}
