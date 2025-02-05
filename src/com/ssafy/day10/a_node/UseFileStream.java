package com.ssafy.day10.a_node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileStream {
	public static void main(String[] args) throws IOException {
		UseFileStream st = new UseFileStream();

		System.out.printf("buffer size: %d, time: %d%n", 100, st.fileMove(100));
		// System.out.printf("buffer size: %d, time: %d%n", 1000, st.fileMove(1000));
		// System.out.printf("buffer size: %d, time: %d%n", 10000, st.fileMove(10000));
		// System.out.printf("buffer size: %d, time: %d%n", 100000,
		// st.fileMove(100000));
		// System.out.printf("buffer size: %d, time: %d%n", 1000000,
		// st.fileMove(1000000));
	}

	public long fileMove(int bufferSize) {
		long start = System.currentTimeMillis();
		// TODO: 본인의 컴퓨터에서 크기가 큰 파일을 선택하세요.
		File src = new File("c:\\ssafy\\eclipse-jee-2018-09-win32-x86_64.zip");
		File target = new File("c:\\Temp\\eclipse.zip");

		// 데이터를 이동시킬 버퍼
		byte[] buffer = new byte[bufferSize];

		// TODO: bufferSize 크기의 byte []을 이용해서 src를 target에 복사하시오.
		// InputStream, OutputStream 연결
		try (FileInputStream fin = new FileInputStream(src); FileOutputStream fout = new FileOutputStream(target)) {
			int read = -1;
			while ((read = fin.read(buffer)) > 0) {
				fout.write(buffer, 0, read); // buffer에 있는 것 가져옴. 처음부터 buffer 까지
			}
		} catch (FileNotFoundException e) { // 자식 error 먼저
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// END
		return System.currentTimeMillis() - start;
	}
}
