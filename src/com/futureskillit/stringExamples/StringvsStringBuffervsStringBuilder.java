package com.futureskillit.stringExamples;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		String s1 = "Cypress"; // string literal - SCP 
		String s2 = new String("Cypress"); // String is a class ; refer to object & then SCP

		StringBuffer s3 = new StringBuffer("Cypress");
		StringBuffer s4 = new StringBuffer("Cypress");
		
		StringBuilder s5 = new StringBuilder("Cypress");
		StringBuilder s6 = new StringBuilder("Cypress");
		
		System.out.println("String reference comparison : " + s1 == s2); // compares references
		System.out.println("String content comparison :" + s1.equals(s2)); // compares string content 
		
		System.out.println("---------- String Buffer------------");
		System.out.println("String Buffer reference comparison : " + s3.equals(s4)); 
		System.out.println("String Buffer comparison :" + (s3 == s4));
		
		System.out.println("---------- String Builder------------");
		System.out.println("String Builder reference comparison : " + s5.equals(s6)); 
		System.out.println("String Builder comparison :" + (s5 == s6));
		
		System.out.println("String Builder to string and contentcomparison : " + s5.toString().equals(s6.toString())); 
		
		System.out.println("String Builder to string and reference  comparison : " + (s5.toString()) == (s6.toString())); 
		
		
		
		/* Mutability
		 * String is Immutable ; where as String Buffer & String Builder - Mutable (we can change value of the string)
		 * 
		 * Thread safety 
		 * String - (safe due to immutability)
		 * String Buffer - Is thread safe; Synchronized
		 * String Builder - Isn't thread safe (Asynchronous) 
		 * 
		 * Performance 
		 * String - SLow
		 * StringBuffer - Medium
		 * StringBuilder - parallel execution - Fast 
		 * 
		 * No string constant pool - StringBuffer & Builder
		 * 
		 */

		/* Not available in String & available in StringBuffer & StringBuilder
		 * 
		 * append()
		 * insert()
		 * reverse()
		 * capacity()
		 * delete()
		 */
		
		
	}

}
