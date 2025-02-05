package com.ssafy.day11.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.day11.dto.BoxOffice;

public class BoxOfficeSaxParser extends DefaultHandler implements BoxOfficeParser {
	// TODO: singleton 형태로 작성해보자.
	// 생성자 private 만들기
	private static BoxOfficeSaxParser parser = new BoxOfficeSaxParser();

	private BoxOfficeSaxParser() {
	}

	public static BoxOfficeSaxParser getParser() {
		return parser;
	}
	// END

	// 파싱된 내용을 저장할 List
	private List<BoxOffice> list;
	// 지금 처리할 객체의 내용
	int rank;
	String movieNm;
	String openDt;
	int audiAcc;

	// 방금 읽은 텍스트 내용
	private String content;

	@Override
	// TODO: getBoxOffice를 재정의하여 SAXParser를 구성하고 boxoffice.xml을 파싱하시오.
	// 반드시 재정의
	public List<BoxOffice> getBoxOffice(InputStream resource) {
		list = new ArrayList();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			parser.parse(resourse, this);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
		} cateh (ParserConfigurationException e){
			e.printStackTrace();
		}
	}

	// END

	// TODO: 필요한 매서드를 재정의 하여 boxOffice.xml을 파싱하시오.

	// END
}
