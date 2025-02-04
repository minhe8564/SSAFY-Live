package com.ssafy.day09.c_throws;

public class ThrowsTest {
    // TODO: 1. methodCall2()에서 uncheckedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
    // TODO: 2. methodCall2()에서 checkedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
     public static void main(String[] args){
    	 try { // 어딘가에는 try-catch 필요	
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

     
     // 왜 얘는 checkedException 일까?
     // .forName() 이 우리에게 예외를 전달하고 있다
     // 해당 예외상황이 발생할 수 있으니까 사용자 니가 알아서 로직을 처리해
     private static void checkedExceptionMethod() throws ClassNotFoundException {
        Class.forName("Hello");
    }

    private static void uncheckedExceptionMethod() {
        int i = 1 / 0;
    }
}
