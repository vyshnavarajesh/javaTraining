package com.futureskillit.javaPrograms;

public class StarPatternOne {

	public static void main(String[] args) {
	
		// row size is fixed - 6
		// columns size is fixed - 6
		//System.out.print => will print in same line or row
		// System.out.println => will print in next line or next row
		
		/* 1 => 6 */
		 for(int i=1; i<=6; i++) {
			 
				 for(int j=1; j<6; j++) {
					 System.out.print("* "); // columns
				 }
				 
		 System.out.println("* "); // rows 
	}

}
}

/* 6 rows & 6 columns 

* * * * * *
* * * * * *
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 

*/