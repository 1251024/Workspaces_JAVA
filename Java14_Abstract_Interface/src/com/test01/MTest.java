package com.test01;

public class MTest {

	public static void main(String[] args) {
		//Animal animal=new Animal();			//Cannot instantiate the type Animal=객체를 못만든다=animal이라는 객체에 바디가 없어서
												//추상클래스라서 안됨
		//Animal animal=new Animal();		//추상적인걸 하나에 묶어 넣을 때 사용, 상속받은 너네가 만들어
		Animal cat = new Cat();		//cat, dog 클래스는 추상 클래스가 아니라서 new를 쓸 수 있다.
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("생선");
		dog.eat("뼈다귀");
		
	}
}
