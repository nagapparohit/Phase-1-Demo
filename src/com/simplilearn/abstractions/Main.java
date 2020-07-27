package com.simplilearn.abstractions;

public class Main {

	public static void main(String[] args) {
		
		AxisBank axisbank = new AxisBank();
		SBI sbibank = new SBI();
		int balance = 1000;
		
		float result1 = balance * axisbank.rateOfFixedDepositInterest();
		float result2 = balance * sbibank.rateOfFixedDepositInterest();
		
		
		System.out.println("The balance in Axis bank :"+result1);
		System.out.println("The balance in SBI bank :"+result2);
	}
}
