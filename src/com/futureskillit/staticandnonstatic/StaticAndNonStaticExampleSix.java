package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleSix {
	
	public int i = 0; // non - static 
	public static int count = 0; // 0 // class members or global members
	
	StaticAndNonStaticExampleSix(){
		count++;
		i++;
		System.out.println("value of i : "+ i + " Value of counter : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStaticExampleSix obj1 = new StaticAndNonStaticExampleSix(); // 0; (both static & non-static)
		StaticAndNonStaticExampleSix obj2 = new StaticAndNonStaticExampleSix(); // 0 
		StaticAndNonStaticExampleSix obj3 = new StaticAndNonStaticExampleSix(); // 0 

	}

}
