package com.futureskillit.javabasics;

public class ClassOne { // blue print or architecture diagram
/*
	// actions or properties
	String id;
	String status;
	String title;
	
	//behaviour or methods
	void addTestCase() {
		
	}
	
	void updateTestCase() {
		
	}
	*/

	public static void main(String[] args) { 
		//Main Method
		// String[] args or String args[] or String... args
		System.out.println("Start test Method");
		// Starting point for your execution
		// JVM will call class loader => load all the static members
		System.out.println("test Method");
		System.out.println("End test Method");
		//main(args,10);
		//main(args,100,true);
	}
	
	/* Main method can be overloaded */
	public static void main(String[] args, int x) { 
		//Main Method
		// String[] args or String args[] or String.. args
		System.out.println("Start test Method");
		// Starting point for your execution
		// JVM will call class loader => load all the static members
		System.out.println("test Method");
		System.out.println("End test Method");
	}
	
	public static void main(String[] args,int x, boolean b) { 
	
	}

}
