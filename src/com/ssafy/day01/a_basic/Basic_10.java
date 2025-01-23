package com.ssafy.day01.a_basic;

import java.util.Random;

// 100번 주사위를 던진 결과의 합, 평균값 출력
public class Basic_10 {
    public static void main(String[] args) {
        byFor();
        byWhile();
    }

    private static void byFor() {
        int sum = 0;
        int cnt = 100;
        double avg = 0;
        Random rand = new Random();
        // TODO: for 문장을 이용해서 cnt 만큼 주사위를 던지고 그 합과 평균(소수점 1자리)을 출력하시오.
        for(int i = 0; i < cnt; i++) {
        	sum += rand.nextInt(1, 7);
        }
        
        avg = 1.0*sum / cnt;
        
        System.out.printf("sum: %d, avg: %.1f%n", sum, avg);
        // END
    }

    private static void byWhile() {
        int sum = 0;
        int cnt = 100;
        double avg = 0;
        Random rand = new Random();
        // TODO: while 문장을 이용해서 cnt 만큼 주사위를 던지고 그 합과 평균(소수점 1자리)을 출력하시오.
        int i = 0;
        
        while(i < cnt) {
        	sum += rand.nextInt(1, 7);
        	
        	i++;
        }
        
        avg = 1.0*sum / cnt;
        // END
    }

}

//sum: 361, avg: 3.6

