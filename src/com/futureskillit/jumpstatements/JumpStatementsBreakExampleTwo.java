package com.futureskillit.jumpstatements;

public class JumpStatementsBreakExampleTwo {

	public static void main(String[] args) {
	
		int[] numbers = {12,25,38,55,65,79,101,250,369};
		int searchNum = 55;
		
		for(int number : numbers) {
		
			System.out.println("checking for Number  : "+ number);
					if(number==searchNum)
					{
						System.out.println(" Number  found ");
						break;
					}
		}
	}

}


/*
switch 
retry operation
exit loop based on conditional check
search operation
*/