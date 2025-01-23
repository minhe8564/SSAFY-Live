package com.ssafy.day03.c_modifier.access.p2;

import com.ssafy.day03.c_modifier.access.p1.Parent;

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class OtherPackageChildClass extends Parent{
	 public void useMember() {
			this.publicVar = 10;
			this.protectVar = 10;
//			this.defaultVar = 10;
//			this.privVar = 10;
//			this.non = 10;
		}
    // END
}
