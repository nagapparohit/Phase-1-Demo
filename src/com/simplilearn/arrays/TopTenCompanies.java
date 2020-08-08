package com.simplilearn.arrays;

import java.util.Scanner;

public class TopTenCompanies {

	public static void main(String[] args) {
		String[] topTenCompanies = {
				"DELL",
				"Ericsson",
				"Google",
				"Facebook",
				"Microsfot",
				"Netflix",
				"Amazon",
				"Akamai",
				"TCS",
				"Infosys"
		};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your company name to verify");
		
		String inpComp = input.nextLine();
		int count =0 ;
		
		for(int index=0;index < topTenCompanies.length;index++) {
			
			if(topTenCompanies[index].equals(inpComp)) {
				System.out.println("Your company is listed in top ten companies and position is "+(index+1));
				count = 1;
			}
		}
		
		if(count<=0) {
			System.out.println("Your company is not present in top 10 companies.");
		}
		
	}
}
