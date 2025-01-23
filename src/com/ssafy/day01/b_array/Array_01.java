package com.ssafy.day01.b_array;

import java.util.Arrays;
import java.util.Random;

public class Array_01 {
	public static void main(String[] args) {
		int N = 6;
		Random rand = new Random();
		// TODO: 1~6까지의 random 정수 5개를 저장할 배열을 만들고 값을 저장 후 출력해보자.
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
//        	arr[n] = rand.nextInt();
			arr[n] = rand.nextInt(6) + 1;
			System.out.print(arr[n] + " ");
		}
		System.out.println();

		// END

		// TODO: 위 배열에 저장된 요소 중 짝수만 더해서 합을 출력하시오.
		int sum = 0;
		for (int n = 0; n < N; n++) {
			if (arr[n] % 2 == 0) {
				sum += arr[n];
			}
		}
		System.out.println(sum);
		// END
	}
}
