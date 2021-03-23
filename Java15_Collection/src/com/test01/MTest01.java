package com.test01;

import java.util.Vector;

public class MTest01 {

	public static void main(String[] args) {

		// Vector(iCa, cpIn)
		// iCa만큼 용량(capacity)만든다. iCa를 넘어가면 cpIn만큼 용량 증가한다.
		// size들어가는 용량,실제 들어가는것 / capacity 들어가는 최대 크기, 영역내거 라고 10칸을 미리 잡아둠
		// 메모리 내부적으로 배열을 만드는것이라고 생각하면 됨, 그래서 배열과 비슷함 용량과 사이즈에 관계있음
		// 배열은 고정,만들면 변하지 않으나 캐파시티는 변할 수 있다. 캐파시티자체가 줄어들지는 못한다.
		
		Vector<Integer> v = new Vector<Integer>(10, 5);
		System.out.println(v.size() + ":" + v.capacity()); // size=0, capacity = 10

		for (int i = 0; i < 9; i++) {
			v.add(i); // 값을 넣을때마다 새로운 배열
			System.out.println(v + "->" + v.size() + ":" + v.capacity());
		}

		v.add(9);
		System.out.println(v + "->" + v.size() + ":" + v.capacity());

		v.add(10);
		System.out.println(v + "->" + v.size() + ":" + v.capacity());

		v.remove(0);
		System.out.println(v + "->" + v.size() + ":" + v.capacity());

	}
}
