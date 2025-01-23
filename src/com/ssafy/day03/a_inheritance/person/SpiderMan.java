package com.ssafy.day03.a_inheritance.person;

public class SpiderMan extends Person { // is a
	Spider spider = new Spider(); // has a
	boolean isSpider;

	SpiderMan(String name, boolean isSpider) {
		super(name); // 이름 설정은 조상 책임
		this.isSpider = isSpider;
	}

	void fireWeb() {
		if (isSpider) {
			spider.fireWeb();
		} else {
			System.out.println("어떡하지???");
		}
	}

//	@Override // override 실패 확인
	void jump() {
		if (this.isSpider) {
			spider.jump();
		} else {
//			System.out.println("폴짝");
			super.jump();
		}
	}

	void jump(String using) {
		System.out.println(using + "의 도움을 받자.");
		this.jump();
	}

	@Override
	void eat() {
		if(isSpider) {
			System.out.println("우걱우걱");
		}
		super.eat();
	}

}
