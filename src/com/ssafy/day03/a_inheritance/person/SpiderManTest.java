package com.ssafy.day03.a_inheritance.person;

public class SpiderManTest {

    public static void main(String[] args) {
        // TODO:  SpiderMan 객체를 만들고 기능 사용해보자.
    	SpiderMan sman = new SpiderMan("피터파커", true);
    	sman.isSpider = true;
    	sman.eat();
    	sman.jump();
    	sman.fireWeb();
    	sman.jump("스카이콩콩");
        // END
    }
}
