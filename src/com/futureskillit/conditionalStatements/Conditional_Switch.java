package com.futureskillit.conditionalStatements;

public class Conditional_Switch {

	public static void main(String[] args) {
	
		/* +; - ; / ; * ; % */
		
		int a = 40;
		int b = 20;
		char c = '+';
		String weekday = "Mon";
		
		/* legacy switch */
		/*
		switch(c) {
			case '+' : System.out.println("Addition :"+ (a+b)); 
							break;
			case '-' : System.out.println("Substraction :"+ (a+b));
						  	break;
			case '*' : System.out.println("multipication :"+ (a*b));
							break;
			case '/' : System.out.println("Division :"+ (a/b)); break;
			case '%' : System.out.println("Modulus :"+ (a%b));
							break;

			default :  System.out.println("Please choose valid arithmetic operator");
		}*/
		
		//Advanced switch statement
		switch(c) {
		case '+' -> System.out.println("Addition :"+ (a+b)); 
		case '-' -> System.out.println("Substraction :"+ (a+b));		
		case '*'->System.out.println("multipication :"+ (a*b));
		case '/' -> System.out.println("Division :"+ (a/b)); 
		case '%' -> System.out.println("Modulus :"+ (a%b));
		default ->  System.out.println("Please choose valid arithmetic operator");
		
	
	}

	}

}
