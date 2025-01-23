package com.ssafy.day04.c_polymorphism;

class SuperClass {
	String x = "super";

	static void a() {
		System.out.println("super class static method");
	}

	public void method() {
		System.out.println("super class method");
	}
}

class SubClass extends SuperClass {
	String x = "sub";

	static void a() {
		System.out.println("sub class static method");
	}

	@Override
	public void method() {
		System.out.println("sub class method");
	}
}

public class MemberBindingTest {

	public static void main(String[] args) {
//        SubClass subClass = new SubClass();
		SuperClass superClass = new SuperClass();
		// TODO: 참조 객체의 레벨에 따라 어떤 멤버 변수 또는 메서드가 동작하는지 확인하시오.
		superClass.a(); 
		// END
	}

}

//super class static method

