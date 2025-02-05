package com.ssafy.day10.a_node;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class NodeDiaryTest {
	final File target = new File("c:/Temp/diary.txt");

	public static void main(String[] args) throws IOException {
		NodeDiaryTest st = new NodeDiaryTest();
		st.writeDiary();
		st.readDiary();
	}

	private void writeDiary() {
		String readDiary = null;
		try (
//				Scanner scanner = new Scanner(System.in);
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//				FileWriter writer = new FileWriter(target, true); 
				BufferedWriter writer = new BufferedWriter(new FileWriter(target, true)); 
				) {
			System.out.println("일기를 작성합니다. 그만두려면 x를 입력하세요.");
			writer.write("\n오늘 날짜: - " + new Date() + "\n");

			// TODO: Scanner를 통해서 읽은 내용을 writer를 통해서 파일에 출력하시오.
			String str = null;
			while (true) {
//				str = scanner.nextLine();
				str = reader.readLine();
				if (str.equals("x")) {
					break;
				} else {
					writer.write(str + "\n");
				}
			}
			// END

			System.out.println("일기 저장 완료!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readDiary() {
		System.out.println("읽기");
		try (
//				FileReader reader = new FileReader(target)
				BufferedReader reader = new BufferedReader(new FileReader(target));
				) {

			// TODO: reader를 이용해 diary의 내용을 읽은 후 콘솔에 출력하시오.
//			char[] buffer = new char[10];
			String line = null;
			int read = -1;
//			while ((read = reader.read(buffer)) > 0) {
//				System.out.print(String.copyValueOf(buffer, 0, read));
//			}
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			// END

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//일기를 작성합니다. 그만두려면 x를 입력하세요.
//오늘 시험은 생각보다 쉽지 않았다.
//이제 나는 올라갈 일만 남았다.
//기념으로 10분 쉬자.
//x
//일기 저장 완료!!
//읽기
//
//오늘 날짜: - Wed Feb 05 15:36:19 KST 2025
//오늘은 IO를 배웠다.
//
//오늘 날짜: - Wed Feb 05 15:36:39 KST 2025
//오늘 시험은 생각보다 쉽지 않았다.
//이제 나는 올라갈 일만 남았다.
//기념으로 10분 쉬자.
