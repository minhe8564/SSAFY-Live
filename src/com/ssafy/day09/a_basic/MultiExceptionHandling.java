package com.ssafy.day09.a_basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionHandling {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO: 다음에서 발생하는 예외를 처리해보자.
//		Class.forName("abc.Def"); // ClassNotFoundException
//		new FileInputStream("Hello.java"); // FileNotFoundException
//		DriverManager.getConnection("Hello"); // SQLException
		// END

		try {
			Class.forName("abc.Def"); // ClassNotFoundException
			new FileInputStream("Hello.java"); // FileNotFoundException
			DriverManager.getConnection("Hello"); // SQLException
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 정상 종료");

	}
}
