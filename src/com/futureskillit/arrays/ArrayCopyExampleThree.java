package com.futureskillit.arrays;

import java.util.Arrays;

public class ArrayCopyExampleThree {

	public static void main(String[] args) {

		int[] x = {15,25,35,45,60};
		
		int[] y = Arrays.copyOf(x, x.length);
		
		for(int j=0; j<y.length;j++) {
			System.out.println(y[j]);
		}

	}

}
