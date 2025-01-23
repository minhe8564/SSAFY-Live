package com.ssafy.day01.a_basic;

public class Basic_05 {
    public static void main(String[] args) {
        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        // TODO:i2의 값을 예상하고 출력해보세요.
        // overflow 발생
        // -2147483648
        System.out.println(i2);

        // END

        long l1 = i1 + 1;
        // TODO:l1의 값을 예상하고 출력해보세요.
        // -2147483648
        System.out.println(l1);

        // END
        
        long l2 = (long) (i1 + 1);
        // TODO:l2의 값을 예상하고 출력해보세요.
        // 이미 깨진 값, 형 변환 후 할당은 의미 없음
        // 애초에 키워야 함
        // -2147483648
        System.out.println(l2);

        // END
        
        
        long l3 = (long) i1 + 1;
        // TODO:l3의 값을 예상하고 출력해보세요.
        // -2147483648
        // 2147483648
        System.out.println(l3);

        // END
        
        int i3 = 1000000 * 1000000 / 100000;
        int i4 = 1000000 / 100000 * 100000;
        // TODO:i3와i4의 값을 예상하고 출력해보세요.
        // -7273
        // 1000000
        System.out.println(i3);
        System.out.println(i4);

        // END
    }
}
