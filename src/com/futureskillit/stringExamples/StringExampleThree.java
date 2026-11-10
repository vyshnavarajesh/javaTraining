package com.futureskillit.stringExamples;

public class StringExampleThree {

	public static void main(String[] args) {
		
		float f = 100.50f;
		double d = 20.555d;
		
		String s1 =String.valueOf(f); // converting float to String
		System.out.println(s1);
		System.out.println(s1.getClass().getName()); // type of the data
		
		String s2 =String.valueOf(d); // converting float to String
		System.out.println(s2);
		System.out.println(s2.getClass().getName());
		
		String str = "1234";
		System.out.println(str.getClass().getName());
		
		int num = Integer.parseInt(str); // string to integer
		System.out.println(num);
		
		
		//
	}

}
