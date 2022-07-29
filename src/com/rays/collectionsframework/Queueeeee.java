package com.rays.collectionsframework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queueeeee{
	public static void main(String[] args)throws Exception {
		
		//PriorityQueue= new PriorityQueue();
		LinkedList c=  new LinkedList();
		
		c.offer("A");
		c.offer("b");
		c.offer(10);
		c.offer(20);
		 
		for(Object o :c) {
		System.out.println(o);

        }
    	System.err.println(".......");
		System.out.println(c.poll());
		 //it removes the header/starting element i.e. A//
			for(Object o :c) {
			System.err.println("after poll>>>>"+o);

	        }
		System.out.println("...........");
		System.err.println("peek>>>>>>>>>"+c.peek());
//		//it gives the header/starting element i.e. B//
		
		for(Object o:c) {
			System.out.println("aftr peek>>>>>>"+o);
			
		}
	
	}
}