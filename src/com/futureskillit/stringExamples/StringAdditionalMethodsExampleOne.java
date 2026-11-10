package com.futureskillit.stringExamples;

import java.util.Arrays;
import java.util.List;

public class StringAdditionalMethodsExampleOne {

	public static void main(String[] args) {
		
		String fruits = String.join("_","Orange","Apple","Mango","Berries","Pine Apple");
		//System.out.println(fruits);
		
		List<String> languageList = Arrays.asList("English","French","Hindi","Kannada","German");
		
		fruits = String.join(", ", languageList);
		
		System.out.println(fruits);

	}

}
