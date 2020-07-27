package com.simplilearn.accessmodifier2;

import com.simplilearn.accessmodifier.PersonData;

public class MainTest extends PersonData {

	public static void main(String[] args) {
		
		//create object
		PersonData personData = new PersonData();
		
		//public method : accessible
		personData.getAge();
		
		//protected variable or method
		MainTest maintest = new MainTest();
		
		maintest.getSalary();
		
	}
}
