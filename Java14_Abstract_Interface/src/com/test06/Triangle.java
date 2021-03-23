package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해 주세요: ");
		int x = sc.nextInt();
		System.out.println("높이를 입력해주세요: ");
		int y = sc.nextInt();

		double res = (double) (x * y) / 2;

		// 더블타입을 문자열로 바꾸는 방법(다 나옴)
		// setResult(String.valueOf(res));
		// setResult(Double.toString(res));
		// setResult(res+"");

		// 0.00까지 나오게 하는것(소수점 둘째자리)
		setResult(String.format("%.2f", res));

	}

	public void print() {
		System.out.println("삼각형의 ");
		super.print();
	}
}
