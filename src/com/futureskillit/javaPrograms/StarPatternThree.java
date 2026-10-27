package com.futureskillit.javaPrograms;

public class StarPatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=6; i>=1; i--) { // rows
			 
			 for(int j=1; j<=i; j++) { // 6 // j<=5 ; j <=4 --- j<=1 (*)
				 System.out.print("* "); // columns
			 }
			 
	 System.out.println(" "); // rows 
}


	}

}


/*


* * * * * *   / row 1 has 6 columns
* * * * *  
* * * *  
* * *  
* *  
* - row 6 has 1 columns

*/
