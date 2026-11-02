package com.futureskillit.classandobjects;

public class TestCase {
	//variable or properties
	int testCaseId;
	String testName;
	String status;
	
	//methods or behaviours
	void executeTest() {
		System.out.println("Executing : "+ testName);
		status = "passed";
	}
	
	void testResult() {
		System.out.println(testCaseId + "=> " + testName + "=> " + status);
	}

}
