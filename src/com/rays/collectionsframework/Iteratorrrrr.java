package com.rays.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratorrrrr {
	
	public static void main(String[] args) {
		
		Collection c= new ArrayList(); 
		
		for(char i='a'; i<'z'; i++) {
			//System.out.println(c);
			c.add(i);
			
		}
		System.out.println(c+"...");
		//gives values in array index
		
		Iterator it= c.iterator();
		//it iterate out single single values  
		while(it.hasNext()) {
			
			Object o=it.next();
			
			System.out.println(o);
		}
		if(it.hasNext()) {
		 it.remove();
		 //element z has been removed
		}
		System.out.println(c);
		it.remove();
		System.out.println(c);
		
	}

}
