package com.ssafy.day07.d_etc.sort;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o1.length();
		return Integer.compare(len1, len2);
	}
}
