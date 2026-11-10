package com.futureskillit.stringExamples;

public class StringExampleProgramTwo {

	public static void main(String[] args) {
		String str = "Java Training for Selenium Automation";
		//Output = avaJ gniniarT  rof  miuneleS
		String output="";

		String[] strArray = str.split(" "); // {"Java", "Training", "for","Selenium"}
		
		for(int i=0; i<strArray.length;i++) {
				
			for(int j=strArray[i].length()-1; j>=0;j--) {
						output= output + strArray[i].charAt(j);
					}
			
			output= output + " ";
			
		}
		System.out.println(output);
	

	}

}
