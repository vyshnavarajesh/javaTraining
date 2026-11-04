package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleFour {
	
	public int a = 100; // non - static 
	public static int b = 200;
	
	public void nonStaticMethodOne() {
		System.out.println("this is a non-static method");
		
		System.out.println(a);
		System.out.println(b);
		// we can access both static & non-static variables in non-static methods
	}
	
	public static void staticMethodOne() {
	//	System.out.println(a);
		System.out.println(b);
		System.out.println("this is a static method");
		// we cannot access non-static variables in static methods ; we get compile time errors
	}

	public static void main(String[] args) {
		
		// we have to create object to call the non-static methods
		StaticAndNonStaticExampleFour obj = new StaticAndNonStaticExampleFour();
		obj.nonStaticMethodOne();
		
		// we can directly call static methods 
		
		staticMethodOne();
		

	}

}
