package com.ssafy.day06.a_generic.box;

public class NumberBox<T extends Number> {

	public void addSome(T... ts) { // 좀 별루 : 배열 사용 -> 타입 안정성 별룸
		double sum = 0;
		
		for(T t : ts) {
			sum += t.doubleValue();
		}
		
		System.out.println("총 합은: " + sum);
	}

	public void addAll(int i, double d) {
		// TODO Auto-generated method stub
		
	}

}