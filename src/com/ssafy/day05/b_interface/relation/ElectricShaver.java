package com.ssafy.day05.b_interface.relation;

// TODO: ElectricShaver를 충전 가능하게 설정하시오.
public class ElectricShaver extends Shaver implements Chargeable {

	// TODO: Chargeable을 구현하시오.
	@Override
	public void charge() {
		System.out.println("면도기 충전!!!");
	}

    // END
}
