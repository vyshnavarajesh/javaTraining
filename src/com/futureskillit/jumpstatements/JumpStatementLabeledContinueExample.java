package com.futureskillit.jumpstatements;

public class JumpStatementLabeledContinueExample {

	public static void main(String[] args) {
	
		outerloop:
			for(int rows=1; rows<=4;rows++) {
				
				innerloop:
				for(int columns=1; columns <=4;columns++) {
					System.out.println( "row : "+ rows + ", column : "+ columns);
					
					if(rows==2 && columns ==2) {
						System.out.println("Value in excel found");
						continue innerloop;
					}
				}
				
			}
		System.out.println("Table execution completed");

	}

}
