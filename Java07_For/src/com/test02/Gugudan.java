package com.test02;

public class Gugudan {

	public static void main(String[] args) {
		// for문을 사용하여 출력!
		// while문 사용 금지
		// 1. 2단부터 9단까지 전체 출력
		// gugu01();
		guguwhile01();

		// 2. 아규먼트로 들어온 값의 단만 출력
		// gugu02(5); // 5단
		guguwhile02();
	}

	public static void guguwhile01() {
		// 초기값
		int i = 2;
		// 조건식
		while (i < 10) {
			System.out.println("<" + i + "단>");

			// 초기값
			int j = 1;
			// 조건식
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));

				// 증감식
				j++;
			}
			// 증감식
			i++;
		}

	}

	public static void guguwhile02() {
		int dan=3;
		int i=0;
		System.out.println("<" + dan + "단>");

		while(i<10) {
			
		
			int j = 1;
		while(j < 10) {
			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));

			j++;
			
		}
		i++;
		}
	}

	public static void gugu01() {
		for (int i = 2; i < 10; i++) {
			System.out.println("<" + i + "단>");

			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println();

		}

		System.out.println();

	}

	public static void gugu02(int dan) {
		System.out.println("<" + dan + "단>");
		for (int j = 1; j < 10; j++) {

			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));
		}
	}

}
