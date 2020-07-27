package com.simplilearn.accessmodifier;

public class PersonData {

	//member variable
		private int age=40;
		
		protected double salary = 100099.90;
		
		//member method
		 void showAge() {
			System.out.println("Age is 40");
		}
		
		public int getAge() {
			return age;
		}
		
		protected double getSalary() {
			return salary;
		}
}
