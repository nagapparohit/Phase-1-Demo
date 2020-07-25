package com.simplilearn.typecasting;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String price = "100";
		
		int priceInt = Integer.parseInt(price);

		int number = 10;
		
		String data =String.valueOf(number);
		
		System.out.println("The String Value : "+price);
		
		System.out.println("The Integer value : "+priceInt);
		
		System.out.println("The String data Value : "+data);
		
	}

}
