package com.simplilearn.typecasting;

public class FirstTypeDemo {

	public static void main(String[] args) {
	
		//Widening or Automatic Conversion or Implicit Type Casting
		// Byte --> short --> int --> long --> float --> double
		byte countByte = 127;
		
		int count = 100;
		
		long countBig = count;
		
		float countFp = countBig;
		
		double countDecimal = countFp;
		
		double byteToDouble = countByte;
		
		System.out.println("Byte Value :"+countByte);
		System.out.println("Int Value :"+count);
		System.out.println("Long Value :"+countBig);
		System.out.println("float Value :"+countFp);
		System.out.println("Double Value :"+countDecimal);
		
		
		

	}

}
