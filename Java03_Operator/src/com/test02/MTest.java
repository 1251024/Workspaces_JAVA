package com.test02;

public class MTest {

	public static void main(String[]  args) {
		
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.basketStting("바나나",10);
		
		FruitBasket.basketSize = 20;
		//bananaBasket.basketSize=15;
		System.out.println(bananaBasket.basketSize);
		//FruitBasket.count=100;	
		//annot make a static reference to the non-static field FruitBasket.count
		//스태틱에서 참조할 수 없다.(호출할 수 없다)
		//스태틱에선 인스턴스를 호출할 수 없음
		//인스턴스에서 스태틱 호출할 수 있음(되도록 하지 말자)
		//가능하면 스태틱에서 스태틱 호출할게 하기
		//인스턴스에서 인스턴스 바꿀 수 있음
		System.out.println(bananaBasket.fruitName);
		//인스턴스 그 객체 하나에만 적용되는 변수
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.basketStting("사과",21);
		System.out.println(appleBasket.basketSize);
		System.out.println(appleBasket.fruitName);
		
		
		
		FruitBasket kiwiBasket = new FruitBasket();
		kiwiBasket.basketStting("키위",1);
		System.out.println(kiwiBasket.basketSize);
		System.out.println(kiwiBasket.fruitName);
		
	}
	
}
