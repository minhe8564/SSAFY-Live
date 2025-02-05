package com.ssafy.day09.d_custom;

import java.util.Arrays;

public class Test {
	
	int serialNumber;
	
	public Test(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public static void main(String[] args) {
		Test[] t = {new Test(3), new Test(1), new Test(2)};
		
//		Arrays.sort(t);
	}
}
