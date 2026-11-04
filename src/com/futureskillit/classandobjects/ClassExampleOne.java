package com.futureskillit.classandobjects;

public class ClassExampleOne {

	public static void main(String[] args) {
	
		// Class - Blueprint (Car)
		// Objects - Instance of a class - Tata; Mahindra ; BMW ; Audi 
		
		// objects has properties & Behaviours
		// wheels = 4 ; steering ; color 
		// InfotaintmentSystem()
		// length < 4 m
		// Speed 
		
		// Animal - class
		//Objects 
		// Dog; Cow ; Tiger
		//properties & behaviours
		// legs ; color ; 
		// run() ; bark() ; roar()
		// food() => herbivorous 
		
		Car car1 = new Car(); // objects are stored in Heap & reference car1 is stored in stack
		car1.brand = "Tata";
		car1.model = "Harrier";
		car1.speed= 100;
		
		car1.start();
		car1.accelerate();
		
		
		Car car2 = new Car();
		
		car2.brand = "Mahindra";
		car2.model = "Scorpio N";
		car2.speed= 120;
		
		car2.start();
		car2.accelerate();	
		
		Car car3 = new Car();
		car3.start();
		car3.accelerate();	
		
		

	}

}
