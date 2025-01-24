package com.ssafy.day05.b_interface;

// interface 구현 -> implements 
public class IronMan implements Fightable, Transformable {

	@Override
	public void changeShape() {
		System.out.println("슈트 장착!!!");
	}

	@Override
	public void fire() {
		System.out.println("빵야!!!");
	}

}
