package com.simplilearn.methods;


public class MethodDemo {

		//no args method
		public static void showMessage() {
			System.out.println("-------------------");
			System.out.println("Welcome to Methods.");
			System.out.println("-------------------");
		}
		
		public static String getMessage() {
			return "Welcome to Methods";
		}
		
		public static int getLuckyNumber() {
			return 74;
		}
		/**
		 * in good coding practice we can have max 5 parameters
		 * @param name
		 */
		public static void greetUser(String name) {
			System.out.println("Hi Welcome, "+name);
		}
		/**
		 * we have runtime and compile time polymorphism
		 * @param name
		 * @param age
		 * @param occ
		 */
		public static void greetUser(String name,int age,String occ) {
			
			System.out.println("Hi , "+name);
			System.out.println("your age is , "+age);
			System.out.println("you work as "+occ);
		}
		
		public static void main(String[] args) {
			
//			showMessage();
//			String response = getMessage();
//			System.out.println(response);
//			
//			int number = getLuckyNumber();
//			System.out.println(number);
			
			//when we call function its arguments
			greetUser("john smith");
			//greetUser("will smith");
			//greetUser("mike smith");
			greetUser("will killer ,",40,"Trainer");
			
			
			
		}
}
