package com.futureskillit.stringExamples;

public class StringBuilderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
//		String s = new String(sb1); // creating string object by passing String Buffer
//		String t = new String(sb2);
		
		sb1.append("Training");
		
		System.out.println(sb1);
		
		StringBuilder sb3 = new StringBuilder("Selenium Training");
		sb3.insert(0,"TestNG");
		
		System.out.println(sb3);
		
		System.out.println(sb3.reverse().capacity());
		
		StringBuilder sb4 = new StringBuilder("Selenium Training");
		sb4.delete(0,6);
		
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder("Selenium Training");
		sb5.replace(0,8, "Playwright");
		
		System.out.println(sb5);
		
		
		
	}

}
