package com.ssafy.day03.a_inheritance.person;

public class Person {
	String name;
	
	public Person(String name) {
		// super();
		this.name = name;
	}
	
	public void jump() {
		System.out.println("폴짝");
	}
	
	public void eat() {
		System.out.println("냠냠");
	}

}
