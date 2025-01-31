package com.ssafy.day06.a_generic.box;

public class NormalBox {
	// objcet 받기
	private Object some;
	
	// 생성자
	public NormalBox() {};

	public NormalBox(Object some) {
		this.some = some;
	}

	// Source -> getter setter 만들기
	public Object getSome() {
		return some;
	}

	public void setSome(Object some) {
		this.some = some;
	}
	
	
}
