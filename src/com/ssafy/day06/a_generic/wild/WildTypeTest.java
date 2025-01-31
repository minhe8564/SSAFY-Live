package com.ssafy.day06.a_generic.wild;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.SpiderMan;
import com.ssafy.day06.a_generic.box.GenericBox;

public class WildTypeTest {
    public void boxCallTest() {
        GenericBox<Object> boxObject = new GenericBox<>();
        GenericBox<Person> boxPerson = new GenericBox<>();
        GenericBox<SpiderMan> boxSpiderMan = new GenericBox<>();

        //notUseWildCardType(boxObject);
        notUseWildCardType(boxPerson);
        //notUseWildCardType(boxSpiderMan);

        // TODO: useWildCardType{n} 메서드를 호출하면서 위 3가지 변수들을 넘겨보자.

        // END
    }

    public void notUseWildCardType(GenericBox<Person> boxPerson) {
    }

    public void useWildCardType1(GenericBox<?> boxAll) {
        // TODO: boxAll에 담을 수 있는 무언가를 담고 빼보자.
    	// 모두 사용 가능
//    	boxAll.setSome("Hello"); // boxSpider
    	boxAll.setSome(null);
    	Obejct obj = boxAll.getSome();
        // END
    }

    public void useWildCardType2(GenericBox<? extends Person> boxExtendsPerson) {
        // TODO: boxExtendsPerson에 담을 수 있는 무언가를 담고 빼보자.
    	// boxObject는 사용 불가
//    	boxExtendsPerson.setSome(new Person("peter"));
    	Person p = boxExtendsPerson.getSome();
        // END
    }

    public void useWildCardType3(GenericBox<? super Person> boxSuperPerson) {
        System.out.println(boxSuperPerson.getClass());
        // TODO: boxSuperPerson에 담을 수 있는 무언가를 담고 빼보자.
        // box SpiderMan은 사용 불가
        boxSuperPerson.setSome(new Person("peter"));
//        boxSuperPerson.setSome(new Object());
        // END
    }

    public static void main(String[] args) {
        WildTypeTest wtt = new WildTypeTest();
        GenericBox<Object> boxObject = new GenericBox<>();
        GenericBox<Person> boxPerson = new GenericBox<>();
        GenericBox<SpiderMan> boxSpiderMan = new GenericBox<>();

        wtt.useWildCardType3(boxPerson);

        boxPerson.setSome(new SpiderMan());

    }
    
    List
}
