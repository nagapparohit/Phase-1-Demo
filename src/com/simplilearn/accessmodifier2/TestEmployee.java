package com.simplilearn.accessmodifier2;

import com.simplilearn.accessmodifier.Employee;

public class TestEmployee extends Employee{

	public static void main(String[] args) {
		
		
		TestEmployee te = new TestEmployee();
		
		//protected member is accessible in another package sub class
		te.showSalary();
		
		//public member is accessible everywhere
		te.empName = "rohit";
		
		//private is not accesiblle anywhere , so accessing via public method
		int x= te.getID();
		
	}
}
