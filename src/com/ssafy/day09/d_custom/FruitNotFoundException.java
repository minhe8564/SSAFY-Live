package com.ssafy.day09.d_custom;

public class FruitNotFoundException extends Exception {
	public FruitNotFoundException(String name) {
		super(name+"가(이) 없습니다.");
	}
}
