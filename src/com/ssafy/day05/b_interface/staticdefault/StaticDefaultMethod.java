package com.ssafy.day05.b_interface.staticdefault;

import java.util.Arrays;

interface Aircon {
    void makeCool();

    // TODO: 2. 건조기능을 추가해보자.
    default void dry() {
    	System.out.println("종료 전에 건조 시킵니다.");
    }

    // END

    // TODO: 3.Aircon이 동작 방식에 대해 설명해보자.
    static void desc() { // 항상 동작
    	System.out.println("에어컨은 시원하게 한다~~");
    }

    // END

    
}

class OldisButGoodies1 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("전체 냉각해줘");
    }
}

class OldisButGoodies2 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("집중 냉각해줘");
    }
}

// TODO: 1. 무풍 에어컨을 구현해보자.
class NoWind implements Aircon {

	@Override
	public void makeCool() {
		System.out.println("소리소문 없이 냉기가 주변을 감싼다!!");
		dry(10);
	}
	
	// dry() 필요하다면 재정의 가능
	@Override
	public void dry() {
		Aircon.super.dry();
		Aircon.super.dry();
	}
	
	public void dry(int min) {
		System.out.println(min + "분 동안");
		dry();
	}
	
}

// END

public class StaticDefaultMethod {
    public static void main(String[] args) {
        Aircon[] aircons = { new OldisButGoodies1(), new OldisButGoodies2(), new NoWind() };
        for (Aircon aircon : aircons) {
            aircon.makeCool();
        }
        Aircon.desc(); // static method
    }
}
