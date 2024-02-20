package com.NonPrimitiveCasting;

public class MainClass {
	public static void main(String[] args) {
		
		//UpCasting(only super class member are visible not sub class members)
		// Son s=new Son();
		//Father f=s;
		
		Father f=new Son();
		System.out.println("Name:"+f.name);
		//System.out.println("Age"+f.age);
		
		
		//DownCasting(Super and sub both class members are visible)
		Son s=(Son)f;
		System.out.println("Name:"+s.name);
		System.out.println("Age:"+s.age);
	}

}
