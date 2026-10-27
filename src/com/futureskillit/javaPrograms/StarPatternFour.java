package com.futureskillit.javaPrograms;

public class StarPatternFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1 => 6 */
		int temp = 1;
		 for(int i=1; i<=4; i++) { // rows
			 
				 for(int j=1; j<=i; j++) { 
					 System.out.print(temp+" "); // columns
					 temp++;
				 }
				 
		 System.out.println(" "); // rows 
	}


	}

}

/*
 * Output :
1  
2 3  
4 5 6  
7 8 9 10  

 * 
 */

/*

This pattern will be printed, when 
	 for(int j=1; j<=i; j++) { 
					 System.out.print(j+" "); // columns
				 }

1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  
1 2 3 4 5 6  

					1
				1	   2
			1	   2      3
			

*/