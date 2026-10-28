package com.futuresillit.arrays;

public class ArrayCopyExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrOne = {10,20,30,40,50,60,70,80,90,100}; //10 
	
		int[] arrTwo = new int[arrOne.length]; // created same as arrOne
		
		//Copying the data from arrayOne to Two
		for(int i=0; i<arrOne.length;i++) {
			arrTwo[i] = arrOne[i];
		}
		
		System.out.println("reading the data from array Two");
		for(int j=0; j<arrOne.length;j++) {
			System.out.println(arrTwo[j]);
		}
		
		arrOne[1] =21;
		System.out.println("reading the data from array Two after arrayOne is updated");
		System.out.println(arrTwo[1]);
		

		arrTwo[2] =35;
		System.out.println("reading the data from arrayOne after arrayTwo is updated");
		System.out.println(arrOne[2]);
	}

}
