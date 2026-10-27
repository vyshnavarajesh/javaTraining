package com.futureskillit.javaPrograms;

public class StarPatternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int temp = 1;
		 for(int i=1; i<=4; i++) { // rows
			 
				 for(int j=1; j<=i; j++) { 
					
					 if((i+j)%2 == 0) {
						 System.out.print(1+" "); 		
					 }
					 else {
					 System.out.print(0+" "); 
					 }
					 
					 
				 }
				 
		 System.out.println(" "); // rows 
	}


	}

}

/*
 * 
1
0 1
1  0 1
0  1  0 1

*/
