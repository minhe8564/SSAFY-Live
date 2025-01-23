package com.ssafy.day01.b_array;

public class Array_04 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] scores = { 90, 80, 100 };

        // TODO: 95점을 추가로 관리하기 부적절한 코드는?
        // scores[3] = 95; // #1 : 예외 발생

        // scores = new int[] {90, 80, 100, 95}; // #2 : 굿, 아예 새롭게 배열 생성

        // scores = {90, 80,100, 95 }; // #3 : new int[] 필요함

        // scores = Arrays.copyOf(scores, 5); // #4 : 굿 
        // scores[3]=95;

        // int[] scores2 = new int[4]; // #5 : 굿
        // System.arraycopy(scores, 0, scores2, 0, scores.length);
        // scores2[3] = 95;

    }
}
