package com.ssafy.day03.c_modifier.access.p1;

public class Parent {
	// 멤버 접근 가능한지 확인
    public int publicVar;
    protected int protectVar;
    int defaultVar;
    @SuppressWarnings("unused")
    private int privVar;

    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
        this.privVar = 10;
    }
}