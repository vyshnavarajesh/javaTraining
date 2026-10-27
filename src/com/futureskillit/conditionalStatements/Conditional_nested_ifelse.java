package com.futureskillit.conditionalStatements;

public class Conditional_nested_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		boolean hasLicense = false;
		
		
		if(age>=21) {
		
						if(hasLicense) {
							System.out.println("User can Drive");
						}
						else {
							System.out.println("User cannot Drive, needs a license");
						}
		} else {
			System.out.println("age criteria not met");
		}

	}

}
