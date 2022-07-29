package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class LocalDate1 {

	public static void main(String[] args) {

		LocalDate l = LocalDate.of(1998, 07, 25);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(l, now);

		System.out.println("years = "+diff.getYears());
		System.out.println("month = "+diff.getMonths());
		System.out.println("days = "+diff.getDays());
	}

}
