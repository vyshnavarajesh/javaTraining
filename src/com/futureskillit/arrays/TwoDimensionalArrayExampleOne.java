package com.futureskillit.arrays;

public class TwoDimensionalArrayExampleOne {

	public static void main(String[] args) {
	
		int arr[][] = new int[3][3] ; // size is 5 ; which can store integer type
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		System.out.println("data at 2nd index :" + arr[2][0]);

	

	}

}
