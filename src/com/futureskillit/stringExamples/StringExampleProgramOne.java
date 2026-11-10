package com.futureskillit.stringExamples;

public class StringExampleProgramOne {

	public static void main(String[] args) {
		
		String str = "Java Training for Selenium Automation";
		//Output = Selenium for Training Java
		
		String output="";

		String[] strArray = str.split(" "); // {"Java", "Training", "for","Selenium"}
		
		for(int i=strArray.length-1; i>=0;i--) {
					output= output + strArray[i] + " ";
		}
		
		System.out.println(output);
	
	
	}

}
