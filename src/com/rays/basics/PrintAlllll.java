package com.rays.basics;

public class PrintAlllll {

	public static void main(String[] args) {

		String[] s = { "Nidhi", "Tanu", "Sankita", "Bhumi" };

		printAll(s);
	}

	public static void printAll(String[] s) {

		for (int i = 0; i < s.length; i++) {

			System.out.println("Me and My friends" + s[i]);

		}
	}
}
