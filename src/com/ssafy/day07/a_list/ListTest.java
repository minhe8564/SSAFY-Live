package com.ssafy.day07.a_list;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class ListTest {
	// 문자열을 저장할 List, 구현체는 ArrayList
	List<String> friends = new ArrayList<>();
//	List<String> friends = new LinkedList<>();

	public static void main(String[] args) {

		ListTest alt = new ListTest();
		alt.createTest();
		alt.retrieveTest();
		alt.updateTest();
		alt.deleteTest();
	}

	public void createTest() {
		// TODO: friends에 여러명의 친구를 등록해보자.
		friends.add("이민희");
		friends.add("이미니");
		friends.add("민희");
		friends.add("민희"); // 데이터 중복 허용, 순서 보장
		// END

		System.out.println("추가 후 내용 출력: " + friends);
		// 추가 후 내용 출력: [이민희, 이미니, 민희, 민희]
	}

	public void retrieveTest() {
		// TODO: 다양한 조회 기능을 사용해보자.
		// 혹시 비어있지는 않나? 요소의 개수는?
		System.out.println(friends.isEmpty() + " : " + friends.size());
		// false : 4

		// 반복을 이용한 요소 순회
		for (String str : friends) {
			System.out.println(str);
		}

		// 이민희가 있다면 그 위치 출력
		if (friends.contains("이민희")) {
			int idx = friends.indexOf("이민희"); // 이민희가 없다면 -1 반환
			System.out.println("이민희의 위치: " + idx);
			// 이민희의 위치: 0
		}

		// 0번 부터 2번 친구만 모아본다면?
		List<String> sub = friends.subList(0, 3);
		System.out.println("0번부터 2번 친구만 출력: " + sub);
		// 0번부터 2번 친구만 출력: [이민희, 이미니, 민희]

		// END

		System.out.println("성춘향 추가");
		System.out.println(friends.add(new String("성춘향")));

	}

	public void updateTest() {
		// TODO: 이민희가 있다면 값을 율도국 왕으로 변경해보자.
		if (friends.contains("민희")) {
			int idx = friends.indexOf("민희");
			friends.set(idx, "율도국 왕");
		}

		System.out.println("수정 후: " + friends);
		// 수정 후: [이민희, 이미니, 율도국 왕, 민희, 성춘향]
		// END
	}

	public void deleteTest() {
		// TODO: 0번째 친구와 율도국 왕을 삭제하시오.
		friends.remove(0);
		friends.remove("율도국 왕");
		// END

		System.out.println("삭제 후 : " + friends);
		// 삭제 후 : [이미니, 민희, 성춘향]
		friends.clear();// 리스트 초기화
		System.out.println("초기화 후 : " + friends);
		// 초기화 후 : []

	}
}
