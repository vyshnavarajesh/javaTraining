package com.futureskillit.arrays;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
	
		int[] arrnumbers = {55,65,79,12,250,25,38,101,369,369, -100, -200};
		/* Arrays.sort(numbers) => [9]; [8] */
		
		int firstLargest = Integer.MIN_VALUE; //0  // 55 > 0 (first) ; 65 > 0 ; 79 > 65
		int secondLargest = Integer.MIN_VALUE; // 0 ; 55 > 79 > 55 also 65 > 55
		
		for(int number : arrnumbers) {
		
					if(number > firstLargest)
					{
						secondLargest = firstLargest;
						firstLargest = number;
					}
					else if (number> secondLargest && number < firstLargest)
					{
						secondLargest = number;
					}
			}
		System.out.println("first largest : " +firstLargest );
		System.out.println("secondLargest  : " +secondLargest );
	}


	}

