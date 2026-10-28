package com.futuresillit.arrays;

import java.util.Arrays;

public class ArrayCopyExampleFour {

	public static void main(String[] args) {
		
		int[] a = {15,25,35,45,60};
		
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int j=0; j<b.length;j++) {
			System.out.println(b[j]);
		}

	}

}
