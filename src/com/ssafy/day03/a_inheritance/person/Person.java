package com.ssafy.day03.a_inheritance.person;

public class Person {
	String name;
	
	Person(String name){
		//super();
		this.name = name;
	}
	
	void jump() {
		System.out.println("폴짝");
	}
	
	void eat() {
		System.out.println("냠냠");
	}

}
