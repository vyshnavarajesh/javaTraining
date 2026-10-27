package com.futureskillit.javaPrograms;

public class SumOfAllDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345; // sum = 21 (1 + 2 + 3+ 4 + 5 + 6)
		int sum=0;
		while(num!=0) {
	
			int temp = num%10; // (remainder) => 5,4, 3, 2, 1
			sum = sum + temp; 
			num = num/10; // quotient => 1234,123 , 12 , 1
		}
		System.out.println("sum of all the  Numbers : "+ sum);
	}

}
