package com.futureskillit.javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 302240; 
		// 4321 => 1234 % 10 => 4 ( 4 types) = loop (for or while) => 4, 3, 2, 1
		// 123 % 10 = 3
		// 12 % 10 = 2
		// 1 % 10 = 1
		
		// 4 * 10 => 40 // 4
		// (40  + 3 ) * 10 = 430 // 40 
		// (430+2) * 10 = 4320 // 400 
		// (4320+1 ) = 4321 //4000
		
		// 1234 / 10 => 123 (Quotient)
		// 123 / 10 => 12
		// 12 / 10 => 1
		
		//Modulus operation
		// multiplication
		// division
		
		int reverse=0;
		while(num!=0) {
	
			int temp = num%10; // (remainder) => 4, 3, 2, 1
			reverse = reverse*10 + temp; // 0*10 = 0 + 4 => 4*10 + 3 => 43 ; 43*10 + 2 => 432; 432*10 + 1=> 4321
			num = num/10; // quotient => 123 , 12 , 1
		}
		System.out.println("reverse Number : "+ reverse);
	}

}
