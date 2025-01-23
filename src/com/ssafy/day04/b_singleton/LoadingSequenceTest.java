package com.ssafy.day04.b_singleton;

public class LoadingSequenceTest {

    private static LoadingSequenceTest lst = new LoadingSequenceTest();
    // TODO: array의 length가 10이 될 수 있도록 코드를 개선해보자.
    // 코드 순서를 바꾸거나, final을 붙이면 길이가 10이 된다
    // 순서대로 선언 후 순서대로 초기화 -> final은 상수라서 초기화도 같이라서 10이됨
     private static int SIZE = 10;

    // END
    private int[] array;

    public static LoadingSequenceTest getInstance() {
        return lst;
    }

    private LoadingSequenceTest() {
        // 멤버 변수의 초기화
        array = new int[SIZE];
    }

    public static void main(String[] args) {
        LoadingSequenceTest lst = LoadingSequenceTest.getInstance();
        System.out.println(lst.array.length); // 0
    }

}
