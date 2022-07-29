package com.rays.basics;

public class Avg {

	public static void main(String[] args) {

		int o = 1;

		int e = 0;

		int sum = 0;

		int count = 0;

		for (o = 1; o <= 10; o = o + 2) {

			sum = sum + o;

			count++;

			System.out.println(o);

		}
		System.out.println("c = " + count);
		System.out.println("sum o avg = " + sum / count);

		count = 0;

		for (e = 0; e <= 10; e = e + 2) {

			sum = sum + e;

			count++;

			System.out.println(e);

		}
		System.out.println("c = " + count);
		System.out.println("sum e avg = " + sum / count);
	}

}
