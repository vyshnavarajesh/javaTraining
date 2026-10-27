package com.futureskillit.javabasics;

public class OperatorsExampleFive {
	
	public static void main(String[] args) {
	int x = 10;
	
	boolean result = x > 20 && ++x >10; // logical operator
	
	System.out.println(result);
	System.out.println(x);
	
	/* ++x will never get executed due to short-circuit */ 
	
	}
}
