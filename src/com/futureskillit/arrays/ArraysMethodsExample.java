package com.futureskillit.arrays;

import java.util.Arrays;

public class ArraysMethodsExample {

	public static void main(String[] args) {
		
		int[] numbers = {5,15,2,9,3,1};
		Arrays.sort(numbers);
		System.out.println("Ascending order");
		for(int num : numbers)
		{
			System.out.print(num+" ");
		}

		System.out.println("Descending order");

		for(int i = numbers.length -1 ; i>=0;i--)
		{
			System.out.print(numbers[i]+ " ");
		}

	}
	
	// sort() ; stream() ; fill(); copyOf(); asList()

}
