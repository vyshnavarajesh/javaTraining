package com.futureskillit.stringExamples;

public class StringExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String immutable - Data of a string cannot be changed*/
		
		String str = "Lemon";
		
		str.concat(str + "Yellow");
		
		System.out.println(str);
		
		String str2 = str.concat("Yellow");
		
		System.out.println(str2);
	
	}

}
