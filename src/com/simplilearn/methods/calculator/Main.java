package com.simplilearn.methods.calculator;

public class Main {

	public static void main(String[] args) {
		
		InputData ip = new InputData(10,5);
		
		
		CalculatorOperations opr = new CalculatorOperations();
		
		opr.add(ip);
		System.out.println("Addition result is :"+ip.getResult());
		opr.subtract(ip);
		System.out.println("Subtraction result is :"+ip.getResult());
		opr.multiply(ip);
		System.out.println("multiplication result is :"+ip.getResult());
		opr.division(ip);
		System.out.println("Division result is :"+ip.getResult());
	}
	
}
