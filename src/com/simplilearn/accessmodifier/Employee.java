package com.simplilearn.accessmodifier;

public class Employee {

	// TODO wap for declaring private public and protected propertied or methods
	// empId --> private
	// empName --> public
	// empSalary --> protected
	
	// getID() --> public 
	// getName() --> public
	// showSalary() --> protected
	
	//create a class TestEmploy in different package and try to call above method in TestEmployee
	
	private int empId;
	public 	String empName;
	protected double empSalary;
	
	public int getID() {
		return empId;
	}
	
	public String getName() {
		return empName;
	}
	
	protected void showSalary() {
		System.out.println("The salary is: "+empSalary);
	}
	
	
	
}
