package com.futureskillit.arrays;

public class ArrayCopyExampleTwo {

	public static void main(String[] args) {
		//Array Copy or clone
		
		int[] a = {15,25,35,45,60};
		
		int[] b =a.clone();
		
		for(int j=0; j<b.length;j++) {
			System.out.println(b[j]);
		}

	}

}
