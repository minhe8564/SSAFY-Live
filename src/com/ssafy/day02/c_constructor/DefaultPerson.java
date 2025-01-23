package com.ssafy.day02.c_constructor;

public class DefaultPerson {
  // non-static 객체를 생성해야 사용 가능함
  String name;
  int age;
  boolean isHungry;
  // static 
  static int num = 100;

  // 컴파일러가 디폴트로 만들어줌
  // public DefaultPerson() {} -- 생략된 기본 생성자
  
  public static void main(String[] args) {
    DefaultPerson person = new DefaultPerson();
    person.name = "홍길동";
    person.age = 10;
    person.isHungry = false;
    
    // DefaultPerson person2 = new DefaultPerson();
    // 오류 발생!
    // 매개변수가 없는 생성자는 없음 -> 만들어야 함
    // 파라미더가 있는 생성자를 만들면 기본 생성자는 추가되지 않는다.
    
    System.out.println(num);
  }
}
