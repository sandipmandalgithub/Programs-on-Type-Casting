package com.Practice;

public class Employee {
	String company="TCS";

}
class Developer extends Employee{
	void developApp() {
		System.out.println("Development the app");
	}
	
}
class Tester extends Employee{
	void testApp() {
		System.out.println("Testing the app");
		
	}
	
}
