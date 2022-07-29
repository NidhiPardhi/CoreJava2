package com.rays.basics;

public class IfWhile {

	public static void main(String[] args) {

		boolean nidhi = true;

		int i = 1;

		int a = 20;

		int b = 30;

		if (a > b) {

			while (nidhi) {

				System.out.println("Hello..." + i);

				i++;

				if (i > 10) {

					nidhi = false;

				}

			}

		} else {
			System.out.println("a is not greater");
		}

	}

}
