package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleTwo {
	
	 static int x = 200;
	 int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStaticExampleTwo test1 = new StaticAndNonStaticExampleTwo(); // this object has got static value x=200 & y =20
		StaticAndNonStaticExampleTwo test2 = new StaticAndNonStaticExampleTwo(); // this has got static value x=200 & y =20
		
		test1.x = 500;
		test1.y = 100;
		
		System.out.println(test1.x);
		System.out.println(test1.y);
		
		System.out.println(test2.x);
		System.out.println(test2.y); // no effect of changing the value from 20 to 100 by a test1

	}

}
