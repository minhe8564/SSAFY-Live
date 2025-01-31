package com.ssafy.day07.b_set;

import java.util.Objects;

// TODO: SmartPhone이 다른 SmartPhone과 번호를 기준으로 비교가능하게 처리하시오.
 public class SmartPhone implements Comparable<SmartPhone> {

    // END
	 int price;
    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(number, other.number);
	}
    
    @Override
	public int hashCode() {
		return Objects.hash(number);
	}

    // Smartphone 비교
	@Override
	public int compareTo(SmartPhone o) {
		return this.number.compareTo(o.number);
	}
    
    // END
    
    

}
