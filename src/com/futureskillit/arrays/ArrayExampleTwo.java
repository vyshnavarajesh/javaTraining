package com.futureskillit.arrays;

public class ArrayExampleTwo {

	public static void main(String[] args) {
		
		int arr[] = {100,200,300,400,500}; //length =5 
		
		System.out.println("size of the array  :" + arr.length); //length or size of array

		System.out.println("data at 2nd index :" + arr[4]);
		
		//for loop 
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		double marks[] = {60.5,75.5,90.00,100.00,30.5}; 
		//Advanced for loop
		System.out.println("Advanced for loop");
		for(double printMarks : marks) {
			System.out.println(printMarks);
		}
		

	}

}
