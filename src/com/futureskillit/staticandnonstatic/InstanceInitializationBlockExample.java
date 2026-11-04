package com.futureskillit.staticandnonstatic;

public class InstanceInitializationBlockExample {
	
	// InstanceInitializationBlock is a block of code that runs/executes every time an object is created
	// it executes before constructor is executed
	
	// Class Loader => static block (1st followed by second static block) => main() => object creation => Instance block => Constructor
	// data initialization if required before object creation 
	static {
		System.out.println(" 1st static block");
	}
	
	{
		System.out.println(" Instance initialization block");
	}
	
	InstanceInitializationBlockExample()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) {

		InstanceInitializationBlockExample obj1 = new InstanceInitializationBlockExample();
		
		InstanceInitializationBlockExample obj2 = new InstanceInitializationBlockExample();
		
		System.out.println("This is from main method");
	}
	
	static {
		System.out.println(" 2nd static block");
	}
	

}
