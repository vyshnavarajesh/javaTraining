package com.futureskillit.loopStatements;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for(initialization ; conditional check ; increment or decrement)
		/* In automation - processing multiple web elements; execute multiple values; fixed page size, fixed table size  */
		/*
		for(int i=1; i<=10;i++)
		{
			System.out.println("Value : "+ i);
		}*/
		
		
		for(int i=10; i>0;i--) 
			// if the logic is i=10; i<=10;i-- => gets in to a infinite loop ( - ve values)
			// if the logic is i=10; i>0;i++ => gets in to a infinite loop (+Ve values)
		{
			System.out.println("Value : "+ i);
		}


	}

}
