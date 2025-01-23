package com.ssafy.day02.d_init;

public class InitializerTest {
	// 인스턴스 멤버 변수
	int iv;
	// 클래스 멤버 변수
	static int cv;

	// 클래스 초기화 블록
	static {
		System.out.println("static initializer");
		cv = 100;
	}

	// 인스턴스 초기화 블록
	{
		System.out.println("instance initializer");
		iv = 100;
	}

	public InitializerTest() {
		System.out.printf("생성자- iv: %d, cv: %d%n", iv, cv);
		this.iv = 300;
	}

	public static void main(String args[]) {
		InitializerTest it = new InitializerTest();
		System.out.printf("1 - cv: %d, iv: %d%n", cv, it.iv);
		InitializerTest it2 = new InitializerTest();
		System.out.printf("2 - cv: %d, iv: %d%n", cv, it2.iv);
	}

	// 객체 생성
	// cv, iv 값 출력
	// 객체 또 생성
	// cv, iv 값 출력

//    static initializer
//    instance initializer
//    생성자- iv: 100, cv: 100
//    1 - cv: 100, iv: 300
//    instance initializer
//    생성자- iv: 100, cv: 100
//    2 - cv: 100, iv: 300

}