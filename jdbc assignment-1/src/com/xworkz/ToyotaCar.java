package com.xworkz;

public class ToyotaCar {

	public static void drive() {
		System.out.println("start the vehicle to drive");
	}
	
	public static void running() {
		System.out.println("change the gear to adjust the speed");
	}
	
	public static void stop() {
		System.out.println("apply brake to stop the car");
	}
	
	private String createCar() {
		String name = "Creta";
		System.out.println("the name of the car is " +name);
		return name ;	
	}
	
	public static void main(String[] args) {
		ToyotaCar t=new ToyotaCar();
		t.createCar();
		ToyotaCar.drive();
		ToyotaCar.running();
		ToyotaCar.stop();
		
		
	}
}

/*class ToyotaTester{
	

} */
