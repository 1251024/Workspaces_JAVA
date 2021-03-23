package com.test03;

public class MyCalc {

	// 접근 제한자, 메모리 영역, 리턴타입(출력), 메소드명, (파라미터(입력, 값을 저장해주는 변수))

	// 더하기
	public static int sum(int i, int j) { // 여기서 int는 알려주는것
		System.out.print("i :" + i + "\t j:" + j + "\t result:");
		int result = i + j; // 여기서 int는 변수 선언

		return result;

	}

	// 변수이름 똑같이 쓰면 안됨, MySum 똑같은 애 선언하면 안됨, 하지만 메소드안에서쓰고 버려지는건 사용가능
	// 지역변수 : 메소드 내부에서 사용하고 사라지기 때문에 또 사용해도 됨

	// 빼기
	public static void sub(int i, int j) {
		int result = i - j;
		System.out.printf("%d - %d = %d\n", i, j, result); // void는 리턴되는 값이 없다

	}

	// 곱하기
	// 문제3-2.
	// double형 파라미터 2개를 받아서
	// 두 수를 곱해서
	// 곱한 결과값을 리턴하는데, 리턴하는 값도 double형
	// 메소드의 이름은 mul
	// 메모리 영역은 static
	// 어디서나 접근 가능
	public static double mul(double d1, double d2) {
		double result = d1 * d2;

		return result;

	}

	// 나누기
	public void div(int i, int j) {
		// '/': 나눈 값
		int div01 = i / j;

		// '%': 나머지
		int div02 = i % j;

		System.out.printf("%d/%d = %d\n", i, j, div01);
		System.out.printf("%d %% %d = %d\n", i, j, div02);
	}

}
