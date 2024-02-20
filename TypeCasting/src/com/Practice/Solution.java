package com.Practice;

public class Solution {
	
	// GENEALIZATION OR UPCASTING
	// 1.VEHICLE OBJ=NEW CAR();
	//2.VEHICLE OBJ=NEW BIKE();
	
	static void display(Vehicle obj) {
		if(obj instanceof Car) {
			System.out.println("Downcasting to the car");
			Car c=(Car)obj;
			System.out.println(c.brand+" "+c.fuel);
		}
		else if(obj instanceof Bike) {
			System.out.println("Downcasting to the bike");
			Bike b=(Bike)obj;
			System.out.println(b.brand+" "+b.color);
		}

		
	}
	public static void main(String[] args) {
		display(new Car());
		System.out.println("-----------------");
		display(new Bike());
		
		
		
		
	}

}
