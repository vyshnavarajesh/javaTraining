package com.futureskillit.classandobjects;

public class Car {
	
	//properties - variabes
	String brand;
	String model;
	int speed;
	
	//behaviours - method 
	void start() {
		System.out.println(brand+ " "+ model + " started");
	}
	
	void accelerate() {
		speed = speed + 50;
		System.out.println("Speed of the vehicle : "+ speed);
	}
	
	

}
