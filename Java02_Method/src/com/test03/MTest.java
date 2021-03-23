package com.test03;

public class MTest {

	public static void main(String[] args) {
		int mySum = MyCalc.sum(10, 2);
		System.out.println(mySum);

		MyCalc.sub(10, 3);

		// 10과 2에 들가는거 =호출할때 전달해주는 값,argument
		// 매개변수, 메소드 외부에서 전달된 값을 받아서 내부에서 사용하기 위한 변수 parameter

		// 문제3-1.
		// mul 메소드 호출하는데
		// 아규먼트는10,3
		// 호출해서 리턴된 결과값을
		// console에 출력하자

		double myMul = MyCalc.mul(10, 3);
		System.out.println(myMul);

		// MyCalc.div(10,4);
		MyCalc calc = new MyCalc();
		calc.div(10, 3);

	}
}
