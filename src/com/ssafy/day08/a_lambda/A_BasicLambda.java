package com.ssafy.day08.a_lambda;

public class A_BasicLambda {
    // TODO: 다음의 interface가 함수형인지 확인해보세요.
	
	@FunctionalInterface
    interface MyFunctional1 {
    	// lambda 식의 타켓 인터페이스 될 수 있음
    	// interface에 있는 abstrace method
        void sayHello(String name); 
    }

    // END

    @FunctionalInterface
    interface MyFunctional2 {
        double numTo(int num);
    }

    private static void useFunction1(MyFunctional1 function, String name) {
        function.sayHello(name);
    }

    private static void useFunction2(MyFunctional2 function, int num) {
        System.out.println(function.numTo(num));
    }

    public static void main(String[] args) {
        // TODO: useFunction1과 useFunction2를 lambda식을 이용해서 호출해보세요.
    	
    	useFunction1(new MyFunctional1() {
    		@Override
    		public void sayHello(String name) {
    			System.out.println("안녕 " + name);
    		}
    	}, "Hello");
    	
    	useFunction1(name -> System.out.println("안녕 " + name), "홍길동");
        // END
    }

}
