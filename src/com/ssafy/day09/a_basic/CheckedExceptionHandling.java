package com.ssafy.day09.a_basic;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	try {
    		Class.forName("abc.Def");
    	} catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}

        // END
        System.out.println("프로그램 정상 종료");
    }

}

// 예외 발생!
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Unhandled exception type ClassNotFoundException
//
//	at com.ssafy.day09.a_basic.CheckedExceptionHandling.main(CheckedExceptionHandling.java:6)
