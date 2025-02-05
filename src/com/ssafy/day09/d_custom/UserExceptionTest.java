package com.ssafy.day09.d_custom;

public class UserExceptionTest {
    private static String[] fruits = { "사과", "오렌지", "토마토" };

    public static void main(String[] args) {
        boolean result = getFruit1("사과");
        if (!result) {
            System.out.println("사과는 없습니다."); // 예외적인 상황
        }
        result = getFruit1("사과");
        if (!result) {
            System.out.println("사과는 없습니다.");
        }
        
        // TODO: 2. getFruit2를 이용해서 오렌지 2개를 소비해서 예외 상황을 테스트 하시오.
        try {
            getFruit2("오렌지");
            getFruit2("오렌지"); // 여기서 예외 발생 예상
        } catch (FruitNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // END

        // TODO: 4. 수박, 멜론, 복숭아을 저장해서 예외 상황을 테스트 하시오.
        addFruit("수박");
        addFruit("멜론");
        addFruit("복숭아");
        addFruit("체리"); // 공간이 없어서 추가 실패 예상
        // END

        System.out.println("창고 관리 끝~");
    }

    private static boolean getFruit1(String name) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return true;
            }
        }
        return false;
    }

    // TODO: 1. getFruit1을 참조하여 예외를 활용하는 형태로 getFruit2를 작성하시오.
    private static void getFruit2(String name) throws FruitNotFoundException {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return;
            }
        }
//        throw new FruitNotFoundException(name + "은(는) 없습니다.");
        System.out.println("error " + name + "가 없습니다.");
    }
    // END

    // TODO: 3. 배열의 null인 지점에 과일을 저장하도록 작성하시오.
    private static void addFruit(String name) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) {
                fruits[i] = name;
                System.out.println(name + " 추가 완료.");
                return;
            }
        }
//        throw new FruitNotFoundException(name + "은(는) 없습니다.");
        System.out.println("error 창고가 꽉 차서 " + name + "을 추가할 수 없습니다.");
    }
    // END
}
