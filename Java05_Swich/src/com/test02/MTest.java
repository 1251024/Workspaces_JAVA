package com.test02;

public class MTest {

	public static void main(String[] args) {

		System.out.println("11월은 " + Season.prn(11) + " 입니다.");

		/*
		 * Season class에 prn메소드를 만들자. parameter로 int형 값 하나를 받아서, 해당 값이 12, 1, 2라면 "겨울"리턴
		 * 3, 4, 5라면 "봄" 리턴 6, 7, 8라면 "여름" 리턴 9, 10, 11라면 "가을" 리턴 1~12 사이의 값이 아니라면
		 * "1~12 사이의 값만 입력해 주세요." 리턴
		 * 
		 * switch 사용해서 문제 풀기! hint는 브레이크
		 */

		//String test;는 변수 선언
		//null은 변수 초기화
		
		String test;
		test = null; //String test = null;
		
		System.out.println(test);
	}

}
