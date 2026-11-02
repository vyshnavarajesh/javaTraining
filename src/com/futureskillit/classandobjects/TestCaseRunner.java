package com.futureskillit.classandobjects;

public class TestCaseRunner{

	public static void main(String[] args) {
		
		TestCase test1 = new TestCase(); // object creation
		test1.testCaseId =001;
		test1.testName = "Verify Registration";
		
	
		TestCase test2 = new TestCase(); // object creation
		test2.testCaseId =002;
		test2.testName = "Verify Login";
		
		TestCase test3 = new TestCase(); // object creation
		test3.testCaseId =002;
		test3.testName = "Verify Logout";
		
		test1.executeTest();
		test2.executeTest();
		test3.executeTest();
		
		
		test1.testResult();
		test2.testResult();	
		test3.testResult();

	}

}
