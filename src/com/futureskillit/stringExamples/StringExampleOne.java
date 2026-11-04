package com.futureskillit.stringExamples;

public class StringExampleOne {

	public static void main(String[] args) {
		
		String s1 = "Java"; // string literal
		String s2 = "Java"; // string literal 
		String s3 = new String("Java"); // String is a class
		String s4 = new String("Java"); // String is a class
		
		System.out.println(s1 == s2); // compares references
		System.out.println(s1.equals(s2)); // compares string content 
		
		System.out.println("----------Comparison of literal vs string object------------");
		System.out.println(s1 == s3); // compares references
		System.out.println(s1.equals(s3)); // compares string content 
		

		System.out.println(s3 == s4); // compares references
		System.out.println(s3.equals(s4)); // compares string content 
		
		char c[] = {'t','r','a','i','n','i','n','g'};
		
		String charArray = new String(c);
		
		System.out.println(charArray);
		
		/*String methods */
		
		String str = "Java Training for Selenium Automation";
		String str2 = "Wednesday";
		
		System.out.println(str.toLowerCase()); // lower case conversion
		System.out.println(str.toUpperCase()); // upper case
		
		System.out.println("validating text : " + str.contains("training")); 
		
		System.out.println("validating text post conversion to lower case : " + str.toLowerCase().contains("training")); 
		
		System.out.println("Approach One : "+ str + " "+ str2);
		System.out.println("Approach Two : "+ str.concat(str2));
		
		String str3 = "      Adding spaces before & after the string     ";
		System.out.println("length of the string with spaces : " + str3.length()); 
		System.out.println("length of the string post trimming the spaces : " + str3.trim().length()); 
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.contains("Selenium")); // true
		System.out.println(str.contains("selenium")); // false
		
		System.out.println(str.replace('a', 'b'));
		
		System.out.println(str.replace("Selenium","Playwright"));
		
		System.out.println(str.substring(5, 12));
		
		String strOne = "Java Training for Selenium Automation";
		
		String[] strArray = strOne.split(" ");
		
		System.out.println(strArray[3]);
		
	}

}
