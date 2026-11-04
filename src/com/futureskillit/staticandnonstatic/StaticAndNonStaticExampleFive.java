package com.futureskillit.staticandnonstatic;

public class StaticAndNonStaticExampleFive {
	
	public static String citizenship = "Aadhar";
	public int aadharNumber;
	public int age;
	public String address;
	
	StaticAndNonStaticExampleFive(int aadharNum, int ageValue){
		aadharNumber = aadharNum;
		age = ageValue;
	}

	public void show() {
		System.out.println("aadharNumber : "+ aadharNumber + "age : "+ age + " citizenship : "+ citizenship);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		StaticAndNonStaticExampleFive obj1 = new StaticAndNonStaticExampleFive();
		obj1.aadharNumber = 101;
		obj1.age = 25;
		obj1.show();
		
		StaticAndNonStaticExampleFive obj2 = new StaticAndNonStaticExampleFive();
		obj2.aadharNumber = 102;
		obj2.age = 45;
		obj2.show();
		
		StaticAndNonStaticExampleFive obj3 = new StaticAndNonStaticExampleFive();
		obj3.aadharNumber = 103;
		obj3.age = 55;
		obj3.show();
		*/
		
		// constructors - used for initializing the data during object creation
		// methods - perform some operation or behavior
		// constructors are not static
		
		StaticAndNonStaticExampleFive obj1 = new StaticAndNonStaticExampleFive(201, 28);
		obj1.show();
		
		StaticAndNonStaticExampleFive obj2 = new StaticAndNonStaticExampleFive(202, 18);
		obj2.show();
		
		StaticAndNonStaticExampleFive obj3 = new StaticAndNonStaticExampleFive(203, 60);
		obj3.show();
		
	}

}
