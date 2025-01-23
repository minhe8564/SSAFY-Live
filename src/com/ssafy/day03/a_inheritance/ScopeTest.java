package com.ssafy.day03.a_inheritance;

class Parent {
    String x = "parent";
}

class Child extends Parent {
    String x = "child";

    void method() {
        String x = "method";
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
    }
}

public class ScopeTest {

    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}

// 현재 상태 출력 결과
// x : method
// this.x : child
// super.x : parent

// method의 x 주석 결과
// x : child
// this.x : child
// super.x : parent

// child의 x 주석 결과
// x : method
// this.x : parent
// super.x : parent