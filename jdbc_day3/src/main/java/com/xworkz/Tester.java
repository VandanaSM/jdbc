package com.xworkz;

public class Tester {

	public static void main(String[] args) {
		
		ParentClass ch=new ChildClass(27);
		System.out.println("name " +ch.name);
		System.out.println("age " +ch.age);
		ch.method1();
		
	}
}
