package com.futureskillit.staticandnonstatic;

public class StaticInitializationBlockExampleTwo {
	
	static int i = 100;
	static int j;

	//method
	public static void test1() {
		System.out.println("From static method one");
	}
	
	public static void test2() {
		System.out.println("From static method two");
	}
	
	public static void test3() {
		System.out.println("From static method three");
	}
	
	static
	{
		System.out.println("value of i from 2nd static block " + i);
		i=10;
	}
	
	static
	{
		System.out.println("value of i from 3rd static block " + i );
	}
	
	static
	{
		System.out.println("From 1st static Block");
		// j = i * 2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		System.out.println(" Value of i : "+ i);
		System.out.println(" Value of j : "+ j);
		
		test1();
		test2();
		test3();
		*/
		

	}

}
