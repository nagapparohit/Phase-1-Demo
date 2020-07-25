package com.simplilearn.typecasting;

public class ExplicitTypeCaseDemo {

	public static void main(String[] args) {
		//Explicit type cast or narrowing
		// Double --> float --> long --> int --> shot --> byte
		
		double price = 100.49 ;
		
		long priceLong = (long) price;
		
		int priceInt = (int)priceLong;

		byte priceByte = (byte) price;
		
		System.out.println("double price Value : "+price);
		System.out.println("long price Value : "+priceLong);
		System.out.println("int price Value : "+priceInt);
		System.out.println("byte price Value : "+priceByte);
		
	}
}
