package com.futureskillit.javabasics;

import java.util.Scanner;

public class ClassOneDemo {

	public static void main(String... xyz) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Scanner class Object
		System.out.println("Enter number : "); // this is like a notification to user to enter data in console 
		int abc = sc.nextInt();
		
		System.out.println("multiplication of : "+ abc * abc);
		
	}
	

}
