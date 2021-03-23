package com.test04;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("왕왕");

	}

	public void eat(String feed) {
		System.out.println("멍멍이가" + feed + "먹는다.");
	}

}
