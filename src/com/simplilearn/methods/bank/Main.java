package com.simplilearn.methods.bank;

public class Main {

	public static void main(String[] args) {
		
		
		Account account = new Account(1020, "john smith", 200000, "john.smith@gmail.com");
		
		BankOperations opr = new BankOperations();
		
		//opr.showAccountBalance(account);
		//opr.depositAmount(account, 500000);
		
		opr.withdrawAmount(account, 100000);
		
		
		
		

	}

}
