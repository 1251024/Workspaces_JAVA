package com.test02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("야옹이");
	}
	
	public void bark() {
		super.bark();		//부모의 바크메소드를 호출해서 자동으로 출력
		System.out.println("야옹");
	}
}
