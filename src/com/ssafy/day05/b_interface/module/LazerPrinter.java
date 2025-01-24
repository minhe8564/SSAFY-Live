package com.ssafy.day05.b_interface.module;

public class LazerPrinter implements Printer {

	@Override
	public void print(String fileName) {
		System.out.println("Lazer Printer로 프린트 한다.");
	}

}
