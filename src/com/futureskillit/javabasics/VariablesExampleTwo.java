package com.futureskillit.javabasics;

public class VariablesExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* When we try to insert integer to short, we will have to cast the data to short type,
		 * it doesn't ensure that same info will be stored, there will be a data loss
		 */
		int abc = 33000;
		short b = (short) abc; 
		
		System.out.println("integer contains : "+ abc );
		System.out.println("short var contains  : "+ b ); //Short max Value : 32767
		
		short xy = 32;
		short def = 30;
		
		Object result = xy * def;
		
		System.out.println("multiply 2 short variables : "+  result.getClass().getName()); // automatic promotion to int
		
		
		
	}

}
