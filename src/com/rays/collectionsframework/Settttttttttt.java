package com.rays.collectionsframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class Settttttttttt {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		
		s.add(20);
		// s.add("N");
		s.add(10);
		// s.add("i");
		s.add(0);
		// s.add("d");

		for (Object e : s) {
			
			System.out.println(e);
		}
		System.err.println(">>>>>  " + s.first());
		// gives first element
		TreeSet t = new TreeSet();

//			t.add("N");
//			t.add("I");
//			t.add("D");
//			t.add("H");
//			t.add("I");
		    t.add(33);

		for (Object b : t) {
			System.out.println(b);
		}
		System.err.println("----->  " + t.first());

		System.out.println("----------)) " + t.last());
		// System.out.println(t.contains("N"));
		System.out.println(t);

		t.addAll(s);
		System.out.println(t);

	}
}
