package com.futureskillit.arrays;

public class TwoDimensionalArrayExampleTwo {

	public static void main(String[] args) {
		
		int arr[][] = {
								{15,25,30},
								{105,210,130},
								{5,77,88}		
						};
		
		
		//for loop 
		for(int rows=0; rows<3;rows++) {
			
			for(int columns=0; columns<3;columns++) {
				System.out.print(arr[rows][columns]+ " ");
			}
			
			System.out.println(" ");
		}
		
		int arrTwo[][] = {
				{10,20,30}, // 1D
				{40,50,60}, // 1D
				{70,80,90}		
		};
		
		System.out.println(" ***********************");
		
		for(int rows=0; rows<arrTwo.length;rows++) {
					
					for(int columns=0; columns < arrTwo[rows].length;columns++) {
						System.out.print(arrTwo[rows][columns]+ " ");
					}
					
					System.out.println(" ");
				}
				
		
		
	}

}
