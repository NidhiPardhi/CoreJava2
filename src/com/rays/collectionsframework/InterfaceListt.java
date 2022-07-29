package com.rays.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class InterfaceListt {
	
	public static void main(String[] args) {

	ArrayList a= new ArrayList();
	
	a.add(0, "A");
	a.add(1, "A");
	a.add(2, "C");
	a.add(3, "D");
    a.add(4, "E");
    a.add(5, "F");
    a.add(6, "A");
    
    System.out.println(a);
    
//    System.out.println("..............");
//    
//    System.out.println(a.get(3));
//    System.out.println("............");
//    
//    System.out.println(a.remove(5));
//    System.out.println(a);
//    System.out.println(".............");
//    
//    System.out.println(a.set(4, "Z"));
//    System.out.println(a);
//    System.out.println(".............");
//    
//    System.out.println(a.indexOf("C"));
//    System.out.println("............");
//    
//    System.out.println(a.lastIndexOf("A"));
//    System.out.println(".............");
     
    ArrayList a1=new ArrayList( a.subList(2, 5));
    System.out.println(a1);
    
    System.out.println(a.addAll(a1));
    
    System.out.println(a);
    System.out.println(a1);
    
	}
	}