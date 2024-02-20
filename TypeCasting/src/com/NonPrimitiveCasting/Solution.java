package com.NonPrimitiveCasting;

public class Solution {
	public static void main(String[] args) {
		
		// upcasting
		Car c=new Car();
		Vehicle v=c;
		System.out.println("Brand:"+v.brand);
		v.start();
		System.err.println("----------------------------");
		// downcasting
		
		Car c1=(Car)v;
		System.out.println("Brand:"+c1.brand);
		System.out.println("Color:"+c1.color);
		c1.stop();
		
		
		
	}

}
