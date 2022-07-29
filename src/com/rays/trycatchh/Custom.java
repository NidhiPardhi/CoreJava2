package com.rays.trycatchh;

public class Custom {

	public static void main(String[] args) {

		int price = 200;

		try {
			if (price > 100) {

				throw new OutOfBudget();
			}
		} catch (OutOfBudget e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		System.err.println("greater dn 100");

	}

}
