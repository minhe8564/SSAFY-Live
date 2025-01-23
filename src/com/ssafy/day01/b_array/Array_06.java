package com.ssafy.day01.b_array;

public class Array_06 {
	public static void main(String[] args) {
		char[] chars = "HelloJavaWorld.DreamisComeTrue".toCharArray();

		// TODO: 각 알파벳이 몇 번 사용 되었는지 사용 횟수를 출력 하세요.(사용된알파벳만 출력)
		// 문자열을 알파벳으로만 구성되었으며 모두 소문자로 간주한다.

		// 알파벳이 인덱스가 될 수 있나?
		// character는 숫자! 될 수 있다

		// - 'a' 사용해서 표현 가능
		// 0 48, A 65, a 97

		int[] arr = new int[26];

		for (int i = 0; i < chars.length; i++) {
			char ch = Character.toLowerCase(chars[i]);
			if (ch >= 'a' && ch <= 'z') {
				arr[ch - 'a']++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				// 사용된 알파벳만 출력
				System.out.println((char) (i + 'a') + ": " + arr[i]);
			}
		}
		// END
	}
}
