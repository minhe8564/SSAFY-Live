package com.ssafy.day04.c_polymorphism;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.SpiderMan;

public class InstanceOfTest {
	private void unsafeCasting() {
		Object obj = 1;
		String s = (String) obj;
		// ClassCastException 오류 Integer는 .length() 사용불가
		System.out.println(s.length());
	}

	private void safeCasting() {
		// TODO: 위 메서드가 안전하게 형 변환할 수 있도록 수정해보자.
		Object obj = 1;
		if (obj instanceof Integer) { // obj 너 Integer 야???
			Integer num = (Integer) obj;
			System.out.println(num.intValue());
		} else {
			System.out.println("무슨 타입? " + obj.getClass().getName());
		}

		// END
	}

	public static void main(String[] args) {
		InstanceOfTest instance = new InstanceOfTest();
		instance.unsafeCasting();
		instance.safeCasting();
	}

}
