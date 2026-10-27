package com.futureskillit.conditionalStatements;

public class Conditional_ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int marks =75; // use scanner class for manual input
		
		if(marks>=80 && marks <90) {
			System.out.println("Grade B");
		}else if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=50)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
