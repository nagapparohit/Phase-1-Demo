package com.simplilearn.methods.bank;

/**
 * emcapustled bean or pojo class
 * @author rohit
 *
 */
public class Account {

	private int accNo;
	private String name;
	private double balance;
	private String email;
	
	//encapsulation class
	
	//default constructor
	public Account() {
		
	}
	
	public Account(int accNo) {
		this.accNo = accNo;
	}
	
	
	public int getAccNo() {
		return accNo;
	}
	
	//parametrized constructor will all value initialzation
	public Account(int accNo, String name, double balance, String email) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
