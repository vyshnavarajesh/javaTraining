package com.futureskillit.javaPrograms;

public class CountOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2234578; // 6
		int abc=0;
		
		while(num!=0) {
			num = num/10; // 22345,2234,223,22 , 2
			abc++; // 1 + 1 + 1 + 1 + 1 + 1
		}
		System.out.println("total number of digits: "+ abc);
	}

}
