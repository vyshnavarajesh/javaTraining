package com.futuresillit.arrays;

public class ArrayExmpleThree {

	public static void main(String[] args) {
		
		Object heterogeneous[] = {10,20.5,"Test",'C',true};
		// System.out.println(heterogeneous[2]);
		
		for(Object ht : heterogeneous) {
			System.out.println(ht);
		}
	}

}
