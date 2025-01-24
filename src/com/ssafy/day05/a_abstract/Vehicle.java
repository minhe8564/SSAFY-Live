package com.ssafy.day05.a_abstract;

public abstract class Vehicle {
	private int curX, curY;

    public void reportPosition() {
        System.out.printf("차종: %s: 현재 위치: (%d, %d)%n", this.getClass().getSimpleName(), curX, curY);
    }

    // 동작하지 않는다 -> 지워버리면 -> 상속을 못해서 addFuel() 메소드 사용을 못함
//    public void addFuel() {
//        System.out.printf("연료가 필요하긴 하지.");
//    }
    public abstract void addFuel();
    
    
}
