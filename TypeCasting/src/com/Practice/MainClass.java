package com.Practice;

public class MainClass {
	
	// Developer d=new Developer();
	//Tester t=new Tester();
	
	
	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d=(Developer)obj;
			System.out.println("Working on "+d.company);
			d.developApp();
		}
		else if(obj instanceof Tester) {
			Tester t=(Tester)obj;
			System.out.println("Working on "+t.company);
			t.testApp();
		}
	}
	public static void main(String[] args) {
		display(new Developer());
		System.out.println("-----------------");
		display(new Tester());
		
	}
	
	

}
