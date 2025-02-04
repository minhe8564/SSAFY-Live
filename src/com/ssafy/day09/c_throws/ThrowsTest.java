package com.ssafy.day09.c_throws;

public class ThrowsTest {
    // TODO: 1. methodCall2()에서 uncheckedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
    // TODO: 2. methodCall2()에서 checkedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
     public static void main(String[] args){
    	 try {
    		 methodCall1();
    	 } catch (ArithmeticException e) {
    		 e.printStackTrace();
    	 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        System.out.println("done");
    }

     private static void methodCall1() throws ClassNotFoundException{
        methodCall2();
    }

     private static void methodCall2() throws ClassNotFoundException{
        uncheckedExceptionMethod();
        checkedExceptionMethod();
    }

     private static void checkedExceptionMethod() throws ClassNotFoundException {
        Class.forName("Hello");
    }

    private static void uncheckedExceptionMethod() {
        int i = 1 / 0;
    }
}
