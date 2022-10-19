package com.xworkz;

public class ChildClass extends ParentClass{

	int age;
	
	public ChildClass(int age) {
		this.age=age;
	}
	
	@Override
	public void method1() {
		System.out.println("child class");
	}
}
