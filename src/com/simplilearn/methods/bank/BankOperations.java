package com.simplilearn.methods.bank;

public class BankOperations {

	//show balance
	
	public void showAccountBalance(Account account) {
		
		System.out.println("The Account user is "+account.getName());
		System.out.println("The Balance is "+account.getBalance());
		
	}
	
	//deposit operations
	public void depositAmount(Account account,double depositAmt) {
		
		
		if(depositAmt > 0) {
			System.out.println("The Balance before deposit :"+account.getBalance());
			double updatedBalance =account.getBalance()+depositAmt;
			account.setBalance(updatedBalance);
			System.out.println("The Balance after deposit :"+account.getBalance());
		}
	}
	
	//withdraw operations 
	public void withdrawAmount(Account account,double withdrawAmt) {
		
		if(withdrawAmt > 0 && withdrawAmt <= account.getBalance()) {
			System.out.println("The Balance before withdraw :"+account.getBalance());
			double updatedBalance =account.getBalance()-withdrawAmt;
			account.setBalance(updatedBalance);
			System.out.println("The Balance after withdraw :"+account.getBalance());
			
			
		}
	}
}
