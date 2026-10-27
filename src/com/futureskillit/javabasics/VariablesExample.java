package com.futureskillit.javabasics;

public class VariablesExample {
	
	//Primitive Data Types
			/* byte - 1 byte - 8 bits (0 or 1) => -128 to 127 ( - 2 power of n to 2 power of n-1 -1)
			 * short - 2 bytes - 16 bits
			 * int  - 4 bytes - 32 bits
			 * long - 8 bytes - 64 bits
			 * 
			 * float - 4 bytes - 32 bits
			 * double - 8 bytes - 64 bits
			 * 
			 * boolean - 1 byte => true or false
			 * 
			 * char - 2 bytes
			 */
			
		byte by = 120;
		short sh = 1000;
		int a = 100, b=200, c=300;
		long ll = 5000L;
		
		float f = 20.34567f;
		double d = 456.56789d;
		
		boolean bool = true;
		
		char ch = 'a';
		
		//Non-Primitive Data Types
		/* String
		 * Arrays
		 * Collections
		 * Class & Objects
		 */
		
		String ss = "testRail";
		int[] arr = {100,200,300};
		
		//instance initializer block - will be executed on object creation
		{
			System.out.println("Instance Block  : "+ Double.MIN_VALUE );
		}
		
		//static initializer block
		/* If you want  to execute any statement automatically when the class loads go fir static initializer block */
		static{
					System.out.println("Static Block : "+ Float.MAX_VALUE );
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byt = 100;
		
		System.out.println("byte min Value : "+ Byte.MIN_VALUE );
		System.out.println("byte max Value : "+ Byte.MAX_VALUE );
		
		System.out.println("Short min Value : "+ Short.MIN_VALUE );
		System.out.println("Short max Value : "+ Short.MAX_VALUE );
		
		System.out.println("Integer min Value : "+ Integer.MIN_VALUE );
		System.out.println("Integer max Value : "+ Integer.MAX_VALUE );
		
		System.out.println("Float min Value : "+ Float.MIN_VALUE );
		System.out.println("Float max Value : "+ Float.MAX_VALUE );
		
		System.out.println("Character min Value : "+ Character.MIN_VALUE );
		System.out.println("Character max Value : "+ Character.MAX_VALUE );
		
		System.out.println("===========================" );
		
		System.out.println("Muliplication of 2 bytes variables : "+ byt * byt);
		VariablesExample var = new VariablesExample();
		
	}

}
