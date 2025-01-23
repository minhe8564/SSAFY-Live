package com.ssafy.day02.a_person;

//클래스
public class Person {
	//속성 - 멤버 변수
	String name;
	int age;
	boolean isHungry;
	
	// 동작 - 멤버 메서드
	void eat() {
		System.out.println("냠냠");
		isHungry = false;
	}
	void work() {
		System.out.println("열심!!!");
		isHungry = true;
	}
}