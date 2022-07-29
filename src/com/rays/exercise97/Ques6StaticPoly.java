package com.rays.exercise97;

public class Ques6StaticPoly {
	
	public void sp(int i,int j) {
		System.out.println(i+j);
	}
    public void sp(String s, String t) {
    	System.out.println(s+" "+t);
    }
    public void sp(int i,String s) {
    	System.out.println(i+" "+s);
    }
    public void sp(char c, char d) {
    	System.out.println(c+" "+d);
    }

    public static void main (String []args) {
    	
    	Ques6StaticPoly sp= new Ques6StaticPoly();
    	
    	sp.sp(10, 20);
    	
    	sp.sp('N', 'P');
    	
    	sp.sp(100, "Hundered");
    
    	sp.sp("Java", "Developer");
         
    }
    
    }