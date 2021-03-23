package com.test02;

public class TypeToType03 {
	public static void main(String[] args) {
		
		
		// boxing 기본 타입의 값을 참조 타입으로 만들어 주는 것
		Integer i=new Integer(100);
		System.out.println(i);
		System.out.println(i.doubleValue()); 	//i.doubleValue() 기본타입의 속성을 가져다 쓰겟다
		
		// unBoxing 참조타입의 값을 기본타입으로 바꾸는것.wrapper class에서 가져오는것
		// 명시적 인트밸류값을 가져올거야
		int j=i.intValue();
		System.out.println(j);
		
		// 묵시적 인티져값 가져다 쓸거야
		int k=i;
		System.out.println(k);
	}
}
