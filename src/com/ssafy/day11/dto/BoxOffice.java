package com.ssafy.day11.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// TODO: 다음 클래스를 record 클래스로 작성해보세요.
//  Integer rank, String movieNm, String openDt, Integer audiAcc를 관리한다.
//  openDt를 Date로 변경해서 반환하는 toDate 메서드를 작성하고 toString을 재정의한다.

// public class BoxOffice{}

public record BoxOffice(Integer rank, String movieNm, String openDt, Integer audiAcc) {
	
	public LocalDate toDate(String str) {
		LocalDate dateObj = null;
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		dateObj = LocalDate.parse(str, fomatter);
		return dateObj;
	}
	
}

// END
