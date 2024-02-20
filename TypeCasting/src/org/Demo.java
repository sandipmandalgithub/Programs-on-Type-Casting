package org;

public class Demo {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son();
		Daughter d=new Daughter();
		
//		Daughter d1=(Daughter)f;
//		System.out.println(d1 instanceof Father);
/*
 ClassCastException: class Father cannot be cast to class Daughter		
 */
		
		
		
		System.out.println(s instanceof Son);
		System.out.println(s instanceof Father);
		System.out.println(d instanceof Daughter);
		System.out.println(d instanceof Father);
		System.out.println(f instanceof Father);
		System.out.println(f instanceof Son);
		System.out.println(f instanceof Daughter);
		
		System.out.println(new Son()instanceof Son);
		
		

	}

}
