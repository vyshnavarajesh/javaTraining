package com.futureskillit.staticandnonstatic;

public class StaticInitializationBlockExampleOne {
	
	static int i = 100;
	static int j;

	//method
	public static void test1() {
		System.out.println("From static method");
	}
	
	
	static
	{
		System.out.println("From static Block");
		j = i * 2;
	}

	public static void main(String[] args) {
	
		System.out.println(" Value of i : "+ i);
		System.out.println(" Value of j : "+ j);
		
		test1();

	}
	
	

}

// We can use static key word for
// variables
// methods
// blocks
// nested class