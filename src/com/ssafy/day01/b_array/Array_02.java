package com.ssafy.day01.b_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {

		String org = "1234567890";
		// TODO: String "1234567890" 의 각 문자를 char [] 과 int[]에 저장하고 출력하시오.
		char[] chars = new char[org.length()];
		int[] ints = new int[org.length()];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = org.charAt(i);
			ints[i] = chars[i] - 'a';

			System.out.println(chars[i] + " " + ints[i]);
		}

//        for(int i = 0; i < chars.length; i++) {
//        	System.out.printf("char: %c, num: %d%n", chars[i], ints[i]);
//        }
		// END
	}
}
