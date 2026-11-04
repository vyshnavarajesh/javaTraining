package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleOne {
	
	public int i = 100; // non - static 
	public static int j = 200;

	public static void main(String[] args) {
		
			System.out.println(StaticAndNonStaticExampleOne.j); // we can call static variable using class Name
			System.out.println(j);
			
			 //System.out.println(StaticAndNonStaticExampleOne.i); // throws an error
			 //System.out.println(i); // throws an error
			
			StaticAndNonStaticExampleOne obj1 = new StaticAndNonStaticExampleOne();
			System.out.println("********************"); 
			System.out.println(obj1.i); // we have to create object to call the non-static variables
			System.out.println("********************"); 
			System.out.println(obj1.j); // we can call the static variables with object reference
			
			obj1.j = 500; // updated from 200 => 500
			
			StaticAndNonStaticExampleOne obj2 = new StaticAndNonStaticExampleOne();
			System.out.println(obj2.j); 
			
			 //obj1.j = null;
			
	}

}
