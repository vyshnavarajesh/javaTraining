package com.futureskillit.jumpstatements;

public class JumpStatementsBreakExampleOne {

	public static void main(String[] args) {
		
		/*
		 * for(int i=1; i<=10;i++) {
		 
			if(i==5)
			{
				break;
			}
			System.out.println("Number is : "+ i );
		}
		*/
		
		for(int i=1; i<=10;i++) {
			if(i>=5 || i<9)
			{
				break;
			}
			System.out.println("Number is : "+ i );
		}



	}

}

/* 

break; - stop the loop completely
continue; - skip only current iteration in loop
return; - method 

labeled break;
labeled continue;

*/

