package com.futureskillit.javaPrograms;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Print prime numbers & total count
		// 2, 3, 5 ,7, 11, 13 => 6
		Scanner scn = new Scanner(System.in); // user can input the data in console
		System.out.println("Enter starting number : ");
		int start = scn.nextInt();

		System.out.println("Enter ending number : ");
		int end = scn.nextInt();
		
		// numbers should not - negative , both numbers should not be zero ; end > start 
		if(start > 0 && start > end) {
				System.out.println("Start & end number should not be zero & ed number is less than start number");
		}
		else {
		int number = start;
		int count =0 ;// will increment as soon as we find a prime number
	
		while(number <= end) { 
			
			if(number >=2) { 
				
				int divisor = 2;
				boolean isPrime = true;
				
				while(divisor <= number/divisor) { // this will check if there are any divisors other than 1 & itself
					// Math.sqrt
					// 11 => 2 <= 11/2 -> 2 -> 2 <= 5 (True)
					// 11 => 3 <= 11 / 3 -> 3 -> 3 <= 3 (True)
					// 11 => 4 <= 11 / 4 -> 4 -> 4 <= 2 (False) -> stop 
					if(number % divisor == 0) {
						isPrime = false;
						break;
					}
					divisor ++;
				}
				if(isPrime) {
					System.out.print(number + " ");
					count++;
				}
				
				
			}
			number++; //increment until we reach end value
		}
		System.out.println("Total prime number : "+ count);
		
		scn.close();
		}
	}
}
