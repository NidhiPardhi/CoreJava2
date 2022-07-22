package com.rays.string;

public class StringClass {

	public static void main(String[] args) {

		String s = "Vijay Dinanath Chouhan";

		for (int i = 0; i <= s.length(); i++) {

		}

		{
			System.out.println("7th character is " + s.charAt(7));
			System.out.println("String Length = " + s.length());
			System.out.println("Chou index is " + s.indexOf("Chou"));
			System.out.println("First i position= " + s.indexOf("i"));
			System.out.println("Last Position Of i = " + s.lastIndexOf("i"));
			System.out.println("a is replaced by b" + s.replace("a", "b"));
			System.out.println("Chota vijay = " + s.toLowerCase());
			System.out.println("bada vijay = " + s.toUpperCase());
			System.out.println("Starts with Vi  " + s.startsWith("Vi"));
			System.out.println("Ends WITH Chou  " + s.endsWith("Chou"));
			System.out.println("Substring " + s.substring(7));
		}

	}

}
