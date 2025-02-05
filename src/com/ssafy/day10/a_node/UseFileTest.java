package com.ssafy.day10.a_node;

import java.io.File;
import java.io.IOException;

public class UseFileTest {

    public static void main(String[] args) {
        try {
            // 절대 경로
            File temp = new File("c:\\Temp");
            System.out.printf("존재? %b, 디렉토리? %b%n", temp.exists(), temp.isDirectory());

            // 상대경로
            File current = new File("."); // 프로그램 실행 위치
            System.out.printf("여기는 어디? %s%n", current.getCanonicalPath());

            // 상대경로의 기준은 java program을 실행하는 위치(소스와 무관)
            // d:\>java -cp .;[project_root]\bin [package].UseFileStream

            // TODO: readme.txt에 해당하는 File 객체를 만들어 보자.
            //  프로젝트와 무관하게 파일을 찾을 때(절대 경로)
            File readMe = new File("C:\\SSAFY\\lmh\\sts-workspace\\java-live\\src\\com\\ssafy\\day10\\a_node\\readme.txt");

            //  프로젝트 내부에서 파일을 찾을 때(상대 경로, 나를 기준으로)
            readMe = new File("./src./com./ssafy./day10./a_node./readme.txt");
            
            //  특정 클래스 기준으로 파일을 찾을 때 (이게 제일 좋은 방법 같다.)
            // 컴파일 된 결과에서 찾아오는 것
            readMe = new File(UseFileTest.class.getResource("readme.txt").getFile());
            System.out.println(readMe.canRead());

            // END
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// 존재? true, 디렉토리? true
// 여기는 어디? C:\SSAFY\lmh\sts-workspace\java-live
