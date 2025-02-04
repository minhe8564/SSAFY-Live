package com.ssafy.day09.a_basic;

public class SimpleException {
    public static void main(String[] args) {
        int[] intArray = { 10 };
        try {
        	System.out.println(intArray[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("예외가 발생했지만 처리함 : 배열 크기 확인 필요");
        }
        System.out.println("프로그램 종료합니다.");
    }
}

// 예외 발생!
// 배열의 길이는 1인데, index 2에 접근하려고 했다는 뜻
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1
//at com.ssafy.day09.a_basic.SimpleException.main(SimpleException.java:6)
