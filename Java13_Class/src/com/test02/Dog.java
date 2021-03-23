package com.test02;

public class Dog extends Animal {

	public Dog() {
		System.out.println("멍멍이");
	}

	//@Override //
	public void bark() {		//@오더라이드
		super.bark();			//부모의 바크메소드를 호출해서 자동으로 출력
		System.out.println("멍멍");
	}

}
