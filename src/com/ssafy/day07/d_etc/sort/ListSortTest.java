package com.ssafy.day07.d_etc.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ssafy.day07.b_set.SmartPhone;

public class ListSortTest {

//    private List<String> names = List.of("Hi", "Java", "World", "Welcome");
	private List<String> names = Arrays.asList("Hi", "Java", "World", "Welcome");


    public void basicSort() {
        // TODO: names를 이름의 오름차순, 또는 그 역순으로 정렬해서출력하시오.
    	Collections.sort(names);
    	System.out.println(names);
    	Collections.reverse(names);
    	System.out.println(names);
        // END
    }

    public void sortPhone() {
        // TODO: 전화 번호에 따라 SmartPhone을 정렬해보자.
    	// 010, 011, 101 은 크기를 비교할 수 있는 방법이 없다!!!
    	// 정렬 불가능
    	List<SmartPhone> phones = new ArrayList<>();
    	phones.add(new SmartPhone("010"));
    	phones.add(new SmartPhone("011"));
    	phones.add(new SmartPhone("101"));
    	
    	Collections.sort(phones);
    	System.out.println(phones);
    	
    	// 어떻게 바꿔주지?
    	// Comparable 사용하기
    	
    	
        // END
    }

    public void stringLengthSort() {
        // TODO: 문자열의 길이에 따라 names를 정렬해보자.

        // END
        System.out.println(names); // [Hi, Java, World, Welcome]
    }

    public static void main(String[] args) {
        ListSortTest st = new ListSortTest();
        st.basicSort();
        // st.sortPhone();
        // st.stringLengthSort();
    }

}
