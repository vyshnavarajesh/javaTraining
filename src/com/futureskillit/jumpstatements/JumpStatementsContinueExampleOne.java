package com.futureskillit.jumpstatements;

public class JumpStatementsContinueExampleOne {

	public static void main(String[] args) {
	
	//skip the current loop	
		 for(int i=1; i<=10;i++) {
		 
			if(i==3)
			{
				continue;
			}
			System.out.println("Number is : "+ i );
		}
	

	}

}
