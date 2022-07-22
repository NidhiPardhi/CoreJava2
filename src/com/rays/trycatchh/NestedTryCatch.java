package com.rays.trycatchh;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		int price=201;
		
		try {
			if(price>100) {
				
				throw new OutOfBudget();
				
			}
		}catch(OutOfBudget o) {
			
			o.printStackTrace();
			System.err.println(o.getMessage());
			
			try {
				if(price>200) {
				  throw new PizzaPrice();   
				}
				
			}catch(PizzaPrice p) {
				
				p.printStackTrace();
				
				System.err.println(p.getMessage());
				
			}
			
		}
	}

}
