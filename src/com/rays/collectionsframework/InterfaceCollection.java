package com.rays.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class InterfaceCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		// add element into Collection
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add(10);

		System.out.println("size = " + c.size());
		System.out.println("_________________");
        //print all element
		
		for (Object o : c) {
			System.out.println( "  "+o+"  ");   
		}
		
		System.out.println("---------------");
		 
		Collection c1= new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("r");
		c1.add("s");
		c1.add(20);
		
//		System.out.println(c1.addAll(c));
//		System.out.println("------------");
//		System.out.println(c1);
//		System.out.println(c1.size());
		
//		System.out.println("-------------");
//    	c1.clear();
//		System.out.println(c1);
//		System.out.println(c1.isEmpty());
	
//		System.out.println("__________");

//		System.out.println(c.contains("NIDHI"));
//		//this object doesn't contain in c thus false
//		System.out.println("--------");
		
//		System.out.println(c.contains("a"));
//		//this value is contain in c thus true
//		System.out.println("............");
		
//		  System.out.println(c.retainAll(c1));
//		  System.out.println("........");
//		  System.out.println(c);
//		  System.out.println(c1);
		 
		  System.out.println("===================================");
		  
//		  System.out.println(c1.retainAll(c));
//		  //only same value in 2 arrays will display as retainAll
//		  System.out.println(c1);
//		  System.out.println(c);
	   
	    System.out.println(c.containsAll(c));
	    System.out.println(".......");
	    System.out.println(c);
	    
	    System.out.println(".........");
	    
	    System.out.println(c1.isEmpty());
	    //false bcoz c1 is not empty
	    
	    System.out.println("...........");
	    
	    System.out.println(c.iterator());
	    
//	    System.out.println(c1.remove("a"));
//	    System.out.println(c1);
//	    
//	    System.out.println("------------------");
//
//		System.out.println(c1.removeAll(c1));
//		System.out.println(c1);
		
		System.out.println("----------------");
		
		System.out.println(c.removeAll(c1));
		System.out.println(c);
		
		
		
}

}
