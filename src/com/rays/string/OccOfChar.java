package com.rays.string;

public class OccOfChar {
	
	public static void main(String[] args) {
		
		String s= "Vijay Dinanath Chouhan";
		char c='a';
		
		for(char j='a';j<='z';j++) {
			int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==j) {
				count++;
			}
		}
		if(count!=0){
			System.out.println(j+" " +count);
		}}
		//System.out.println(count);
		}
		
		
	}

	

