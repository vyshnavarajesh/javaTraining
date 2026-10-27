package com.futureskillit.javaPrograms;

public class ReverseNumberWithLeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12340; 
	
		String reverse="";
		while(num!=0) {
	
			int temp = num%10; // (remainder) => 4, 3, 2, 1
			reverse = reverse + temp; // 0*10 = 0 + 4 => 4*10 + 3 => 43 ; 43*10 + 2 => 432; 432*10 + 1=> 4321
			num = num/10; // quotient => 123 , 12 , 1
		}
		System.out.println("reverse Number : "+ reverse);
	}

}
