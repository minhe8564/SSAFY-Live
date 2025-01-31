package com.ssafy.day06.a_generic.box;

public class UseBoxTest {

    public static void main(String[] args) {
        useNormalBox();
        useGenericBox();
        useNumberBox();
    }

    private static void useNormalBox() {
        // TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
    	NormalBox nbox = new NormalBox();
    	nbox.setSome("Hello");
    	nbox.setSome(1);
    	
    	// Object 리턴 됨
    	nbox.getSome();
//    	Integer i = (Integer)nbox.getSome();
        // END
    }

    private static void useGenericBox() {
        // TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.
    	// 타입 파라미터 무조건 일치해야 한다
    	GenericBox<String> gbox = new GenericBox<>();
    	// String 만 들어 감
    	gbox.setSome("Hello");
    	
    	// String 리턴 됨
    	gbox.getSome();
    	String str = gbox.getSome();
    	
//    	gbox.setSome(1); // type  위배
    	
    	// 필요할 때 type 제한 가능
    	GenericBox<Object> obox = new GenericBox<>();
    	obox.setSome(null);
        // END
    }

    private static void useNumberBox() {
        // TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.
    	NumberBox<Number> box = new NumberBox<>();
    	box.addAll(1, 3.14);
    	box.addAll((Number[])(new Objcet[] {1, 2, "Hello"}));
        // END
    }

}
