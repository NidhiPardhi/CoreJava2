package com.rays.trycatchh;

public class TryFinallyy {

	public static void main(String[] args) throws PizzaPrice {
		
		int price = 500;
	
	try{
		if(price>200) { 
			
			throw new PizzaPrice();
			
		}
		System.out.println("Pizzas available at low prize");
		}
	finally{
		
		System.err.println("Sorry NO Pizzaasssss.....!!!!");	
			
		}
	
	
	
	}
}
