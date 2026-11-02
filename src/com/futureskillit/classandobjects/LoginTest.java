package com.futureskillit.classandobjects;

public class LoginTest {

	public static void main(String[] args) {
	
		LoginPage loginOne = new LoginPage();
		loginOne.userName = "Test User One";
		loginOne.password = "Test Password One";
		loginOne.loginButton = "Yes";
		loginOne.enterUserName();
		loginOne.enterPassword();
		loginOne.clickButton();
		
		LoginPage loginTwo = new LoginPage();
		loginTwo.userName = "Test User Two";
		loginTwo.password = "Test Password Two";
		loginTwo.loginButton = "No";
		loginTwo.enterUserName();
		loginTwo.enterPassword();
		loginTwo.clickButton();
		
		

	}

}
