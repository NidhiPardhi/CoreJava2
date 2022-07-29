package com.rays.basics;

public class Factorial {

	public static void main(String[] args) {

		int i;

		int n = 5;

		int fact = 1;

		for (i = 1; i < n; i++) {

			System.out.println("fact = " + fact + " * " + "i = " + i);

			fact = fact * i;

			System.out.println("fact = " + fact);
		}

	}

}
