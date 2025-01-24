package com.ssafy.day05.a_abstract;

public class VehicleTest {

  public static void main(String[] args) {
    // TODO: DieselSUV와 ElectricCar를 각각 한대씩 관리하는배열을 만들고 사용해보자.
	  Vehicle[] vehicles = { new HouseCart(), new DieselSUV(), new ElectricCar() };
	  
	  for(Vehicle v : vehicles) {
		  v.reportPosition();
		  v.addFuel(); // vmi : virtual method invocation, 동적 바인딩
		  
		  // Vehicle.java에서 addFuel() 메소드를 지우면 -> 공통 모듈 생김 -> 비효율적
//		  if(v instanceof ElectricCar e) {
//			  e.addFuel();
//		  }
//		  if(v instanceof DieselSUV d) {
//			  d.addFuel();
//		  }
	  }
    // END
  }

}
