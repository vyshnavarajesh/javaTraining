package com.futureskillit.javabasics;

public class OperatorsExampleTwo {

	public static void main(String[] args) {
		
		/*Relational operators >,<, >=,<=, ==, != */ /* used in conditional statements */
		/* return type is boolean */
		
		int num1 =100;
		int num2 =200;
		
		System.out.println("result => "+ (num1 != num2));
		
		/* logical operators  => &&  (AND), || (OR); ! (Not) */
		
		/* 
		 * && 
		T T => T
		T F => F
		F T => F
		F F => F 
		
		||
		T T => T
		T F => T
		F T => T
		F F => F
		 */
		
		int num3=200;
		int num4 =300;
		
		System.out.println((num1 < num2) && (num3 < num4));
		System.out.println((num1 < num2) || (num3 < num4));
		
		/* ternary operator => ? and  : */
		/* condition ? value_if_true : value_if_false */
		/* simply works as if-else */

		int age =15;
		String result = age>=18 ? "eligible for vote" : "Not eligible";
		System.out.println(result);
		
	}

}
