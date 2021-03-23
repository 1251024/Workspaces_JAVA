package com.test01;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("고양이가 ");
		super.eat(feed);
		//부모거에서 기능을 확장시키고 싶을 때 사용
	}

}
