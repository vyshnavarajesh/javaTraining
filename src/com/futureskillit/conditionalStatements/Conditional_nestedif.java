package com.futureskillit.conditionalStatements;

public class Conditional_nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean qaenvAvailable = true;
		boolean testing = false;
		
		if(qaenvAvailable) {
				System.out.println("Environment Available");
			if(testing) {
				System.out.println("User can continue Testing");
			}
		}

	}

}
