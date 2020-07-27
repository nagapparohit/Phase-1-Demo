package com.simplilearn.abstractions;

public class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 5.7f;
	}

	@Override
	public float rateOfFixedDepositInterest() {
		return 8.4f;
	}

	
}
