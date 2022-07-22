package com.rays.string;

public class SingleCharCount {
	public static void main(String[] args) {
		
      String s="Captain Vikram Batra";
	
	   char c='a'; 
	   int  count=0;
	   
	   for(int j='a';j<'z';j++) {
	   for (int i =0 ; i<s.length() ; i++) {
		   
		if(s.charAt(i)==c) {
			count++;
		}
		
	   }

       }System.out.println(count);
	 }
	
}
