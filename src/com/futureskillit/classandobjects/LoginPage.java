package com.futureskillit.classandobjects;

public class LoginPage {
	
	String userName ; // each property will have xpath ; css ; id etc;
	String password;
	String loginButton;
	
	//methods or behaviours
	void enterUserName() {
		System.out.println("Entering UserName : "+ userName); // sendKeys
	}
	
	void enterPassword() {
		System.out.println("Entering Password : "+ password);
	}
	
	void clickButton() {
		System.out.println("Clicking on Login Button : "+ loginButton); // .click()
	}
	

}
