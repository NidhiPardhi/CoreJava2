package com.rays.string;

public class ReverseStringgg {

	public static void main(String[] args) {
		String sb = "Vijay dinanath chohan";
		String[] s = sb.split(" ");

		for (int i = 0; i < s.length; i++) {

			for (int j = s[i].length() - 1; j >= 0; j--) {

				System.out.print(s[i].charAt(j));

			}
			System.out.print(" ");

		}
	}

}
