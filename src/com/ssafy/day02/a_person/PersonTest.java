package com.ssafy.day02.a_person;

//테스트용
public class PersonTest {

	public static void main(String[] args) {
		int a = 10;
		Person p1 = new Person(); // 객체 생성
		p1.age = 10;
		p1.name="홍길동";
		p1.eat();
		System.out.println(p1.isHungry);
		
		Person p2 = new Person();
		p2.name = "장길산";
		p2.work();
		System.out.println(p1.name);
	}

}