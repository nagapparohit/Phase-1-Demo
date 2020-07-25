package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConvBasedUserInput {

	public static void main(String[] args) {
		
		//User input from console
		//Scanner for user input 
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter a number from 1 to 100");
		
		String userNumber = input.nextLine();
		
		int userIntValue = Integer.parseInt(userNumber);

		double userDoubleValue = Double.parseDouble(userNumber);
		
		long userLongValue = Long.parseLong(userNumber);

		System.out.println("User Input a Integer : "+userIntValue);
		System.out.println("User Input a Double : "+userDoubleValue);
		System.out.println("User Input a long : "+userLongValue);
		
	}

}
