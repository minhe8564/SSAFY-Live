package com.ssafy.day06.a_generic.box;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.SpiderMan;

public class GenericAttention<I> {

    public void useRawType() {
        // TODO: 다음에서 발생하는 warning을 제거해보자.
    	// row type 오류
        @SuppressWarnings({"rawtypes", "unused"})
//		GenericBox box = new GenericBox();
        GenericBox<String> box = new GenericBox();

        // END
    }

    public void confusing() {

        GenericBox<Person> pbox = new GenericBox<>();
        // TODO: pbox에 담을 수 있는 객체를 담아보자.
        // Person과 SpiderMan은 상속관계다
        // 그렇다면 GenericBox는 상속관계인가??
        // 불가능!! pbox는 Person 타입을 받을 수 있다.
//        pbox.setSome(new Person());
//        pbox.setSome(new SpiderMan());
        
        pbox = new GenericBox<Person>();
        // END

        // TODO: pbox를 다른 객체로 대체해보자.
        GenericBox<SpiderMan> sbox = new GenericBox<>();
        // pbox = sbox;

        // END
    }

    public void cantUseGeneric() {
        //I i = new I();//Cannot instantiate the type I

        GenericBox<SpiderMan> obj = new GenericBox<>();

        // compile error : Type Object cannot be safely cast to GenericBox<String>
        //if(obj instanceof GenericBox<String>) {  }

        if (obj instanceof GenericBox gb) {
            gb.setSome("Hello"); // 타입에 안전하지 않음
            System.out.println("맞지만 타입에 안전하지 않음: " + gb.getSome());
        }

        if (obj instanceof GenericBox<?> gb) {
            // gb.setSome("Hello"); // compile error
            System.out.println("이것이 최선: 뭐든 담기는 GenericBox");
        }
    }

    public void genericArray() {
        // Generic 타입으로는 배열 생성 불가 
        // GenericBox<String> [] boxes1 = new GenericBox<String>[3]; // compile error
        // GenericBox<String> [] boxes2 = new GenericBox<>[3]; // compile error

        GenericBox<Person>[] boxes3 = (GenericBox<Person>[]) new GenericBox[3];
        boxes3[0] = new GenericBox<Person>();
        // TODO: 위코드가 의미 있게 된다면 어떤 불상사가 발생하는지 생각해보자.

        // END
    }

    public static void main(String[] args) {
        GenericAttention<Integer> ga = new GenericAttention<>();
        // ga.cantUseGeneric();
        ga.genericArray();
    }
}
