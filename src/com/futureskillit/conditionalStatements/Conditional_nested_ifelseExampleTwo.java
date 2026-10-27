package com.futureskillit.conditionalStatements;

public class Conditional_nested_ifelseExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =20;
		boolean registeredUser =true;
		
		if(age<18)
		{
			System.out.println("Ticket Price : 100 ");
		}else if(age >=60)
		{
			System.out.println("Ticket Price : 200 ");
		}else {
			if(registeredUser) {
				System.out.println("Ticket Price : 250 ");
			}else {
				System.out.println("Ticket Price : 300 ");
			}
		}
		
		
		
	}

}
