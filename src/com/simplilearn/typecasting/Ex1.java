package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//take user input as int value and convert into float , double and byte
		
		System.out.println("Enter the no. of marbles : ");
		Scanner input = new Scanner(System.in);
		
		int marbles = input.nextInt();
		
		//converting int to float i.e implicit conversion
		float floatMarbles = marbles;
		
		//converting  int to double i.e implicit conversion
		double doubleMarbles = marbles;
		
		//converting int into byte i.e explicit conversion
		byte byteMarbles = (byte)marbles;
		

		System.out.println("int Value is : "+marbles);
		System.out.println("byte Value is : "+byteMarbles);
		System.out.println("float Value is : "+floatMarbles);
		System.out.println("double Value is : "+doubleMarbles);
		
	}
}
