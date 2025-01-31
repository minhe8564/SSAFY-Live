package com.ssafy.day06.a_generic.box;

public class GenericBox<T> {
	private T some;
	
	public GenericBox() {
		
	}
	
	public GenericBox(T some) {
		this.some = some;
	}

	public T getSome() {
		return some;
	}

	public void setSome(T some) {
		this.some = some;
	}
	

}
