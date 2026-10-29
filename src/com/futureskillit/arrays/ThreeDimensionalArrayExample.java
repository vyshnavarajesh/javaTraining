package com.futureskillit.arrays;

public class ThreeDimensionalArrayExample {

	public static void main(String[] args) {
		
		int[][][] numbers = new int[2][3][4]; // blocks; rows; columns
		
		int arr[][][]= {   
				{ 
					{10,20,30}, // 1 D ; row 0 ; Block 0
					{40,50,60,} // 1D ; row 1 ; Block 0
				}, // 2D
				{	
					{70,80,90}, // 1D ; row 0 ; Block 1
					{110,120,130} // 1D ; row 1 ; Block 1
				}
	};

		System.out.println(arr[0][1][2]);
		
		System.out.println(arr[1][1][2]);
		
		System.out.println("***************************");
		
		//for loop 
		for(int blocks=0; blocks<arr.length;blocks++) {
				
			for(int rows=0; rows<arr[blocks].length;rows++) {
					
								for(int columns=0; columns<arr[blocks][rows].length;columns++) {
										System.out.print(arr[blocks][rows][columns]+ " ");
								}
								
										System.out.println(" ");
								}
		
			}
		
		
		/* Different ways of declaring multi dimensional array */
		/* 2D array */
		int[][] twoDArray1;
		int twoDArray2[][];
		int[] twoDArray3[];
		
		/* 3D array */
		int[][][] threeDArray1;
		int threeDArray2[][][];
		int[] threeDArray3[][];
		int[][] threeDArray4[];
		
		/* 4D array */
		int[][][][] fourDArray1;
		int fourDArray2[][][][];
		int[] fourDArray3[][][];
		int[][][] fourDArray4[];
		int[][] fourDArray5[][];
		
	}

}
