package com.ssafy.day01.b_array;

public class Array_05 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };

		// TODO: 위 배열의 요소 중 최대, 최소, 평균, 평균과 절대값의 차이가 가장 큰 값, 가장 작은 값을 출력하시오.
		// 단 평균은 소숫점 2째 자리까지 출력한다.
		int min = intArray[0];
		int max = intArray[0];
		int sum = 0;
		double avg = 0.0;
		int maxDiff = intArray[0];
		int minDiff = intArray[0];

		for (int num : intArray) {
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		// 소숫점 이하 보존을 위해서 1.0 곱함
		avg = 1.0 * sum / intArray.length;

		for (int i = 0; i < intArray.length; i++) {
			maxDiff = Math.abs(avg - maxDiff) < Math.abs(avg - intArray[i]) ? intArray[i] : maxDiff;
			minDiff = Math.abs(avg - minDiff) < Math.abs(avg - intArray[i]) ? intArray[i] : minDiff;
		}

		System.out.printf("max : %d\n", max);
		System.out.printf("min : %d\n", min);
		System.out.printf("avg : %.2f\n", avg);
		System.out.printf("maxDiff : %d\n", maxDiff);
		System.out.printf("minDiff : %d\n", minDiff);
		// END

//        max : 435
//        min : 3
//        avg : 76.00
//        maxDiff : 435
//        minDiff : 435
	}
}
