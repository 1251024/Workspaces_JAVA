package com.test03;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Functional01 {

	public static void main(String[] args) {
//		unaryTest();
		binaryTest();
		
	}
	
	

	private static void binaryTest() {
		BinaryOperator<Integer> sum = (i, j ) -> i + j;
		System.out.println(sum.apply(10, 20));
	}


	private static void unaryTest() {
		UnaryOperator<String> hello = (name) -> "Hello, " + name;
		
		System.out.println(hello.apply("Lambda"));
		
		//UnaryOperator
		//문자열 값을 주면 문자열 값을 리턴해준다.
		//값을 주면 값을 하나 리턴해줄건데, string 형태의 값을 리턴해준다.(리턴될 형싱릉 알 수 있다.)
		//unary는 하나주면 같은 타입의 값을 리턴해준다.
		//binary는 여러개 주면 같은 타입의 값을 리턴해준다.
		
		//BinaryOperator <T> 인터페이스
		//BiFunction<T,​T,​T>
		//유나리처럼 값을 주면 값을 리턴해주는데 여러개를 해주는거
		//해당 t에 맞는 값을 리턴해줄 것임
		
		
	}
}
