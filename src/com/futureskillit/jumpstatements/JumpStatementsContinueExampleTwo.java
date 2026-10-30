package com.futureskillit.jumpstatements;

public class JumpStatementsContinueExampleTwo {

	public static void main(String[] args) {
	
		int[] numbers = {12,25,38,55,65,79,101,250,369,-100, -250};
		
		for(int number : numbers) {
		
					if(number < 0)
					{
						System.out.println(" skipping number :"+ number);
						continue;
					}
			System.out.println("checking for Number  : "+ number);
		}
		
	}

}

/* skipping invalid inputs
 * null or balnk or empty 
 * ignore or skip some test cases
 */
