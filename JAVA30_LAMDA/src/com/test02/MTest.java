package com.test02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		MYProc sum = (a, b) -> a + b;
		MYProc sub = (a, b) -> a - b;
		MYProc mul = (a, b) -> a * b;
		MYProc div = (a, b) -> a / b;
		
		//MYProc 인터페이스 하나로 일회성 코드를 여러개 쓸 수 있다.
		
		//클래스를 하나하나 다 만들어줘야하는데
		//클래스 만들어두면 재사용성이 좋아지는데, MTest안에서만 간단하게 쓰려면 람다식이 편하다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("i 입력: ");
		int i = sc.nextInt();
		System.out.println("j 입력: ");
		int j = sc.nextInt();
		
		System.out.printf("%d + %d = %.0f\n", i, j, sum.calc(i, j));
		System.out.printf("%d - %d = %.0f\n", i, j, sub.calc(i, j));
		System.out.printf("%d * %d = %.0f\n", i, j, mul.calc(i, j));
		System.out.printf("%d / %d = %.2f\n", i, j, div.calc(i, j));

	
		//나머지 (%)
		MYProc mod = (a, b) -> a % b;
		//람다식을 통해서 메소드를 실제로 구현하는거
		//i, j로 하면 지역변수가 들어가는데 위에 변수 i가 선언되어있음
		
		System.out.printf("%d %% %d = %.0f\n", i, j, mod.calc(i, j));
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
	}
}
