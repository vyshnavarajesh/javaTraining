package com.futureskillit.stringExamples;

public class StringAdditionalMethodsExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isBlank
		
		System.out.println("".isBlank());
		System.out.println("     ".isBlank());
		System.out.println("\n   \n".isBlank());
		System.out.println("\t   \t".isBlank());
		System.out.println("string example".isBlank());
		System.out.println("string example    \t \n".isBlank());
		
		
		//lines
		System.out.println("\n   \n \n".lines().count());
		System.out.println("abcdef\n   test xyz\n 123456\n".lines().count());
		
		//repeat
		System.out.println("1234567890 ".repeat(2));
		
		//strip - similar to trim => to remove all the leading & trailing spaces in a string =>          11111         
		//stripLeading - similar to trim => to remove all the leading  spaces in a string =>          11111   
		//stripTrailing - similar to trim => to remove all the trailing  spaces in a string =>          11111       
		
		System.out.println("      1234567          ".strip());
		System.out.println("      12345          ".stripLeading());
		System.out.println("      1234567          ".stripTrailing());
		
		System.out.println("1) %s  2) %s 3) %s".formatted("Orange","Apple","Guava","Pineapple"));
	}

}
