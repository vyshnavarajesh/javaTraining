package com.futureskillit.loopStatements;

import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Use while loop in case of pagination; scrolling ; retry logic in automation ; or anything that is dynamic size */
		/*
		int number =10; // start point
		
		while(number<=100) {
			System.out.println(number);
			number++; // if we dint have an increment operation, it will print the initial number forever
		}
		*/
		/***even & odd numbers */
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter number : ");
		int n =scn.nextInt(); //10 or 20 or 100 => initialization
		
		//Scanner scn = new Scanner (System.in);
		//int n =20;
		
		
		while(n<=100) { //condition
			
			if(n%2==0) {
				System.out.println("Even =>"+n);
			}
			else
			{
				System.out.println("Odd => "+n);
			}
			
			n++; // increment => n++ = n+1
		}
		
	}

}
