package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleThree {
	
	public void nonStaticMethodOne() {
		System.out.println("this is a non-static method");
	}
	
	public static void staticMethodOne() {
		System.out.println("this is a static method");
	}

	public static void main(String[] args) {
		
		staticMethodOne();
		StaticAndNonStaticExampleThree.staticMethodOne();
		
		// StaticAndNonStaticExampleThree.nonStaticMethodOne(); // this will give error
		
		StaticAndNonStaticExampleThree obj1 = new StaticAndNonStaticExampleThree();
		
	 //	obj1.staticMethodOne(); // java doesnt recommend usage f object reference for method calling
		obj1.nonStaticMethodOne();
		

	}

}
