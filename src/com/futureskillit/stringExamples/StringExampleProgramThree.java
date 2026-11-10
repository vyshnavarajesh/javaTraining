package com.futureskillit.stringExamples;

public class StringExampleProgramThree {

	public static void main(String[] args) {
		
		String str = "aaaabbbccdaab";
		//output = a4b3c2d1a2b1
		
		String output = "";
		int counter = 1;
		
		for(int i=0 ; i<str.length();i++) {
			
			if(i< str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
					counter++;
			}else
			{
				output = output+str.charAt(i)+counter;
				counter = 1;
			}
			
		}
		System.out.println(output);
				
	}

}
