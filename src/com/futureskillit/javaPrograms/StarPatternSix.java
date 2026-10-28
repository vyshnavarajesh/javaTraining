package com.futureskillit.javaPrograms;

public class StarPatternSix {

	public static void main(String[] args) {
		
		
		int rowCount = 1;
		
		 for(int i=6; i>0; i--) { // rows
			 
			// inner for loop - responsible for printing the spaces
				 for(int j=1; j<=i; j++) { 
					 System.out.print("-"); 
				 }
				 // printing the numbers 
				 for(int j=1; j<=rowCount; j++) { 
					 System.out.print(j+" "); // columns
				 } 
		 System.out.println(); // rows 
		 rowCount++;
	}
	}
}

/* output
      1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5 
 1 2 3 4 5 6 
		
*/

/* 
 * 
 * changed the 2nd inner loop from printing j => rowCount
 * 
 * // inner for loop - responsible for printing the spaces
				 for(int j=1; j<=i; j++) { 
					 System.out.print(" "); 
				 }
				 // printing the numbers 
				 for(int j=1; j<=rowCount; j++) { 
					 System.out.print(rowCount+" "); // columns
				 } 
				 
				 output will be
				 
				       1 
				     2 2 
				    3 3 3 
				   4 4 4 4 
				  5 5 5 5 5 
				 6 6 6 6 6 6 


 */


/*
 * 
 *   changed the 2nd inner loop from printing j => rowCount
 *   
 *   // inner for loop - responsible for printing the spaces
for(int j=1; j<=i; j++) { 
	 System.out.print(" "); 
}
// printing the numbers 
for(int j=1; j<=rowCount; j++) { 
	 System.out.print(1+" "); // columns
} 

output will be

      1 
     1 1 
    1 1 1 
   1 1 1 1 
  1 1 1 1 1 
 1 1 1 1 1 1 



*/

	
