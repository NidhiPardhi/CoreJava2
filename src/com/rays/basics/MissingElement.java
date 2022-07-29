package com.rays.basics;

public class MissingElement {
	
     public static void main(String[] args) {
		
    	 int[]a= {12,24,67,45,82};
    	 int[]b= {24,12,45};
    	 int t=0;
    	 
    	 for(int i=0;i<a.length;i++) {
    		 
    		 for(int j=0;j<b.length;j++) {
    		 
    		 if(a[i]==b[j]) {
    			 
    			 t=a[j];
    		 }
    		 if(a[i]!=t) {
    			 
    		 }
    		
    	 }
    		 
	} System.out.println("missing element is = "+t );
	
	

}
}
