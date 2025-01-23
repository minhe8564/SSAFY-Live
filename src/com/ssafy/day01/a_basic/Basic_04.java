package com.ssafy.day01.a_basic;

import java.math.BigDecimal;

public class Basic_04 {
    public static void main(String[] args) {
        float f1 = 2.0f;
        float f2 = 1.1f;
        float f3 = f1 - f2;
        System.out.println(f3);

        double d1 = 2.0;
        double d2 = 1.1;
        double d3 = d1 - d2;
        System.out.println(d3);

        // TODO: d1 - d2 를 정확히 계산해보자.
        // 실수에서 정확하게 연산해야 한다.
        // 실수 연산은 정확하지 않기 때문에 반올림 필요
        System.out.println(((int)(d1*100) - (int)(d2*100)) / 100.0);

        // END
    }
}

//0.9
//0.8999999999999999
//0.9
