//CREATE A HELPER/FACTORY METHOD TO CREATE A OBJECT OF CAR I20 WITH METHODS(DRIVE(),RUNNING(),STOP() AND ANOTHER METHOD CREATECAR()
// WHICH HAS TO RETURN ANOTHER CAR OBJECT
package com.xworkz;

public class CarFactory {
	
	public Car createCar(String carName) {
		if(carName=="I20") {
			return new I20();
		}else if(carName=="Kia"){
			return new Kia();
		}else {
			return null;	
		}
	}

	
}
