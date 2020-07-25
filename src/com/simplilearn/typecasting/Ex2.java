package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take user input as string and convert it into int,byte,float and double
		
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		
		String number = input.nextLine();
		
		//converting string into int i.e from primitive to non - primitive
		int intNumber = Integer.parseInt(number);
		
		//converting string into byte i.e from primitive to non - primitive
		int byteNumber = Byte.parseByte(number);
		
		//converting string into float i.e from primitive to non - primitive
		float floatNumber = Float.parseFloat(number);
		
		//converting string into double i.e from primitive to non primitive
		double doubleNumber = Double.parseDouble(number);
		
		System.out.println("String Value is : "+number);
		System.out.println("int Value is : "+intNumber);
		System.out.println("byte Value is : "+byteNumber);
		System.out.println("float Value is : "+floatNumber);
		System.out.println("double Value is : "+doubleNumber);

	}

}
