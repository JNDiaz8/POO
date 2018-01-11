package com.iesvirgendelcarmen.poo.ejercicios;

public class TestCar {
	public static void main (String [] args ) {
		Car car1 = new Car();
		System.out.println(car1);
		System.out.printf("Autonomy %.2f km%n", car1.getAutonomy());
		car1.addFuel(25);
		System.out.println(car1);
		System.out.printf("Autonomy %.2f km%n", car1.getAutonomy());
		
		Car car2 =new Car();
		car2.setConsumption(5);
		car2.setFuelAmount(10);
		System.out.println(car2);
		System.out.printf("Autonomy %.2f km%n", car2.getAutonomy());
		
	}
}
