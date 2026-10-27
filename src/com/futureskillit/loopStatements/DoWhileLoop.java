package com.futureskillit.loopStatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* print certain statement atleast once before your loop runs */
		/* Use do-while loop in case of pagination; if we want to click on some navigation atleast once 
		 * search for an element in web page first, if available go ahead with next steps; else have multiple attempts repeated to find it */ 
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter number : ");
		int n =scn.nextInt(); //10 or 20 or 100 => initialization
		
		do {
			System.out.println("Value of n :" + n);
			n++;
		}
		while(n<=10) ; //condition
		
		System.out.println("Out side do-while loop");
		
	}

}
