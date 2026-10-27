package com.futureskillit.javabasics;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Arithmetic operators  +, -, *, / (quotient) , % (remainder) => BODMAS */
		/* = is an assignment operator , not a comparison operator */
		/* ((25*10) + (25/5) - (10+2) + (4-2)) *100 */
		
		int num1 = 30;
		int num2 = 20;
		
		System.out.println(num1 % num2);
		
		/*Short Hand operators */
		System.out.println("============== Short Hand Operators ==============");
		num1 += 5; // Instead of num1 = num1 + 5 => use short hand operator 
		num2 *=10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		/* Increment & decrement operators => ++ & -- */
		
		int n1 = 100;
		// n1++ is same as n1+1 => Post increment
		int result = n1++;
		System.out.println("============== Increment & Decrement Operators ==============");
		System.out.println("result var "+ result);
		System.out.println("n1 var" + n1);
		
		int n2 =200;
		int pre_incrementResult =++n2;
		System.out.println("pre_incrementResult => " + pre_incrementResult);
		System.out.println("n2 var" + n2);
		
		
		int n3 = 100;
		// n1++ is same as n1+1 => Post increment
		int result3 = n3--;
		System.out.println("result var "+ result);
		System.out.println("n1 var " + n3);
		
		int n4 =200;
		int pre_decrementResult =--n4;
		System.out.println("pre_decrementResult => " + pre_decrementResult);
		System.out.println("n2 var" + n4);
		
		/** storing incremented value in same var & assignment operator **/
		int n5 =200;
		n5=n5++;
		System.out.println("n5 var " + n5);
		
		/*no usage of assignment operator */
		int n6 =300;
		n6++;
		System.out.println("n6 var " + n6);
		
		/*no usage of assignment operator */
		int n7 =300;
		++n7;
		System.out.println("n7 var " + n7);
	
	}

}
