package com.futureskillit.conditionalStatements;

public class Conditional_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* if ; if-else ; if else-if ; nested if ; switch */
		
		boolean b = true;
		
		if(b) //always true
			System.out.println("print true");
		else 
			System.out.println("print false");
		
		int age =16;
		
		if(age>=18) {
			System.out.println("Eligible");
		}else
		{
			System.out.println("not eligible");
		}
		
		if(age%2==0) {
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}
		

	}

}
