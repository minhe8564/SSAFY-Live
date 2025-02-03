package com.ssafy.day08.a_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class B_Sorting {
	private String[] langs = { "Java", "C", "JavaScript", "Python" };

	public void sortByAnnonymous() {
		Comparator<String> c;
		Arrays.sort(langs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		});

		System.out.println("문자열 내림차순: " + Arrays.toString(langs));
//        문자열 내림차순: [Python, JavaScript, Java, C]
	}

	public void sortByLambda() {
        // TODO: lambda 식을 이용하여 langs를 문자열의 길이 순으로 오름차순 정렬하시오.
    	
    	Arrays.sort(langs, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
    	
        // END
        System.out.println("길이 오름차순: " + Arrays.toString(langs));
//        길이 오름차순: [C, Java, Python, JavaScript]
    }

	public static void main(String[] args) {
		B_Sorting st = new B_Sorting();

		st.sortByAnnonymous();
		st.sortByLambda();
	}
}
