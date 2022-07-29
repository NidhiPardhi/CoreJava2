package com.rays.basics;

public class SwitchArray {

	public static void main(String[] args) {

		String[] s = { "hello", "brother" };

		switch (s[0]) {

		case "hello":
			System.out.println("i am hello");
			break;
       
		case "brother":
			System.out.println("i am brother");
			break;
			

		default:
			System.out.println("koi baat nhi");
		}
	}

} 