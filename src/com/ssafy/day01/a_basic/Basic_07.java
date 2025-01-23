package com.ssafy.day01.a_basic;

public class Basic_07 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;

		// TODO: 다음에서 발생하는 오류를 읽고 원인을 말한 후 수정하시오.
		// 산술 연산 4byte보다 작으면 int로 바꿔서 계산한다.
//        byte b3 = b1 + b2;
		byte b3 = (byte) (b1 + b2);

		int i1 = 10;
		long l1 = 1;
//         int i2 = i1 + l1;
		long i2 = i1 + l1;

//         float f1 = 10.0;
//         float f2 = f1 + 20.0;
		float f1 = 10.0f;
		double f2 = f1 + 20.0;

		// END
	}
}
