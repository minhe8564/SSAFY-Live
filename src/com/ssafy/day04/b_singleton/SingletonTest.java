package com.ssafy.day04.b_singleton;

class SingletonClass extends Object {
	// TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
	private static SingletonClass instance = new SingletonClass();
	
	public static SingletonClass getInstance() {
		return instance;
	}
	
	public SingletonClass() {
		super();
	}

	// END
	public void sayHello() {
		System.out.println("Hello");
	}

}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO:SingletonClass를 사용해보세요.
		SingletonClass sc = new SingletonClass.getInstance();
		sc.sayHello();

		SingletonClass sc2 = new SingletonClass.getInstance();
		sc2.sayHello();
		// END
	}
}
