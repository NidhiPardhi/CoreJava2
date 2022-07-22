package com.rays.basics;

public class G100 {

	public static void main(String[] args) {

		int i;

		int sum = 0;

		int count = 0;

		for (i = 100; i < 200; i++) {

			if (i % 7 == 0) {

				count++;

				sum = sum + i;

				System.out.println(i);

			}
		}
		System.out.println(count);
		System.out.println("s = " + sum);
		System.out.println("Sum = " + sum / count);
	}
}
