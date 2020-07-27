package com.simplilearn.methods.calculator;

public class CalculatorOperations {

		//addition operation it should pass negativ value or null , perform validation 
	// sub
	//mul
	//div
	
	public void add(InputData data) {
		data.setResult(data.getNum1()+data.getNum2());
	}
	
	public void subtract(InputData data) {
		data.setResult(data.getNum1()-data.getNum2());
	}
	
	public void multiply(InputData data) {
		data.setResult(data.getNum1()*data.getNum2());
	}
	
	public void division(InputData data) {
		if(data.getNum2() !=0) {
			data.setResult(data.getNum1()/data.getNum2());
		}else {
			System.out.println("Cannot divide by zero.");
		}
		
	}
		
}
