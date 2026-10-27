package com.futureskillit.javaPrograms;

public class StarPatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1 => 6 */
		 for(int i=1; i<=6; i++) { // rows
			 
				 for(int j=1; j<=i; j++) { // 2 1 <=3 ; 2 < - 3; 3 <= 3
					 System.out.print("* "); // columns
				 }
				 
		 System.out.println(" "); // rows 
	}


	}

}


/* 6 rows & 6 columns 

* - row 1 with 1 column
* * - row 2 with 2 column
* * * 
* * * * 
* * * * * 
* * * * * * - row 6 with 6 column

*/