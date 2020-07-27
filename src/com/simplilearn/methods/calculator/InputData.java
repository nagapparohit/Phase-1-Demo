package com.simplilearn.methods.calculator;

public class InputData {
 //WAP with POJO with
// total --> double --> private
	//number 1 --> int --> private
	//number 2 --> int --> private
	
	//constructor with argument as well as no arguments
	
	//getter and setter for every property
	
	private double num1;
	private double num2;
	
	private double result;

	
	public InputData() {
		// TODO Auto-generated constructor stub
	}
	public InputData(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	
	}
	public InputData(double num1, double num2, double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
	
}
