package com.xworkz;

public class TestMain {

	public static void main(String[] args) {
		
		CarFactory carFactory=new CarFactory();
		
		Car i20=carFactory.createCar("I20");
		i20.drive();
		
		Car kia=carFactory.createCar("Kia");   //if given lowercase kia nullpointerexception
		kia.drive();
		
		
		
		
	}
}
