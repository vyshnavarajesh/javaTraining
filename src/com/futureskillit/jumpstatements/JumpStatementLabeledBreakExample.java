package com.futureskillit.jumpstatements;

public class JumpStatementLabeledBreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* normal break will exit the nearest loop statement, whereas labeled ones will help us break execution at multiple levels */
		outerloop:
			for(int rows=1; rows<=4;rows++) {
				
				innerloop:
				for(int columns=1; columns <=4;columns++) {
					System.out.println( "row : "+ rows + ", column : "+ columns);
					
					if(rows==2 && columns ==2) {
						System.out.println("Value in excel found");
						break innerloop;
					}
				}
				
			}
		System.out.println("Table execution completed");
	}

}

// try it out by changing the label from innerloop to outerloop in line 17
