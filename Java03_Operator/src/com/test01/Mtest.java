package com.test01;

public class Mtest {

	// 클래스안에 변수를 선언할 수 있음
	// 전역변수
	// 다른메소드에서도 사용할 수 있고 클래스 안에서 선언할 수 있는 변수
	// 같은 이름의 변수를 선언할 수 없다.
	public static int ten = 10;

	public static final int MY_TEN = 10;

	// 지역변수와 전역변ㄴ수의 이름이 같으면 "지역변수"가 우선!
	// 웬만하면 같은 이름으로 쓰지 않는게 좋음
	// 지역변수

	// 변수=변하는값,상수=항상 같은 값변하지 않는 수
	// 상수:변수 앞에 final붙이면 상수가 됨, 상수는 대문자로 쓰는게 암묵적인 룰, 스네이크 표기법

	public static void main(String[] args) {
		int ten = 100;
		System.out.println(ten);

		System.out.println(op01(MY_TEN, 3));
		System.out.println(op02());

		op03(MY_TEN, 3);
		// System.out.println(op04());
		op04();
		String five = (op05()) ? "재밌다." : "즐겁다.";
		System.out.println(five);
		op06();
		op07();

	}

	public static String op01(int a, int b) {
		// 1.사칙연산

		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d 의 몫: %d, 나머지: %d\n", a, b, a / b, a % b);

		return "사칙연산 끝!";

	}

	public static String op02() {
		// 2.대입연산(+=,-=,*=,/=)
		int res = 0;
		System.out.println("res:" + res);
		res = res + 10;
		System.out.println("res:" + res);
		res = res - 5;
		System.out.println("res:" + res);

		System.out.println(res - 5);
		System.out.println(res);

		res += 5; // res=res+5;
		System.out.println(res);

		res *= 2; // res=res*2;
		System.out.println(res);

		return null;

	}

	public static void op03(int a, int b) {
		// 증감연산
		// ++/--
		// 변수의 앞 뒤에 증가/증감 연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/증감 하게 된다.
		// 전위연산:연산자를 변수 앞에 붙여서 연산을 먼저 하게 되고, 값을 나중에 리턴한다.
		// 후위연산:연산자를 변수 뒤에 붙여서 값을 먼저 리턴하고, 연산을 나중에 하게 된다.
		System.out.println(a); // 10
		System.out.println(++a); // 전위연산, 11
		System.out.println(a++); // 후위연산, 11(12)
		System.out.println(a); // 12

		// a=12 b=3
		int result = a++ + --b + b++ + ++a;
		// result=12(13)+2(2)+2(3)+14(14)
		// 12+2+2+14
		// a=14 b=3
		System.out.println(result);
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

	public static void op04() {
		// 논리연산 : &(and그리고), |(or또는), &&, ||

		System.out.println(true & true); // 참 그리고 참 : 참
		System.out.println(true & false); // 참 그리고 거짓 : 거짓;
		System.out.println(false & true); // 거짓 그리고 참:거짓;
		System.out.println(false & false); // 거짓 그리고 거짓:거짓;

		System.out.println(true | true); // 참 또는 참: 참;
		System.out.println(true | false); // 참 또는 거짓 : 참;
		System.out.println(false | true); // 거짓 또는 참: 참;
		System.out.println(false | false); // 거짓 또는 거짓 : 거짓;

		System.out.println(true && true); // 참 그리고 참
		System.out.println(true && false); // 참 그리고 거짓
		System.out.println(false && true); // 거짓 그리고 참
		System.out.println(true && false); // 거짓 그리고 거짓

		System.out.println(true || true); // 참 또는 참
		System.out.println(true || false); // 참 또는 거짓
		System.out.println(false || true); // 거짓 또는 참
		System.out.println(false || false); // 거짓 또는 거짓

		int a = 2;
		int b = 3;

		System.out.println((a > b) && (b > a));

	}

	public static boolean op05() {
		// 6.삼항연산
		// (조건) ? 참일때 리턴값 : 거짓일때 리턴값;
		int a = MY_TEN;
		int b = 7;
		int result = (a > b) ? a - b : b - a;

		System.out.println(result);

		String res = (a > b) ? "a가 b보다 크다" : ((a < b) ? "a가 b보다 작다" : "a와b는 같다");

		return false;

		// System.out.println("끝났냐?"); ->여기까지 손이 닿지 않아요

	}

	public static void op06() {
		// 5. 비교연산(>,<,>=,<=,==) 같다는 ==
		System.out.println(true == false);
		System.out.println(MY_TEN != 3); // !는 같지 않다

	}

	public static void op07() {
		// 7.비트연산(&,|,^,~,<<,>>, ...):값을 0,1 비트 상태에서 연산한 결과를 리턴
		//bit
		
		int a = 10;
		// 0000 0000 0000 0000 0000 0000 0000 1010;	자리수 32개
		int b = 2;
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		
		System.out.println(a & b);
		// 0000 0000 0000 0000 0000 0000 0000 1010;	
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		//&-------------------------------------------
		// 0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(a | b);
		// 0000 0000 0000 0000 0000 0000 0000 1010;	
		// 0000 0000 0000 0000 0000 0000 0000 0010;
		//|-------------------------------------------
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		
		System.out.println(~a);
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		//~-------------------------------------------
		// 1111 1111 1111 1111 1111 1111 1111 0101;
		
		System.out.println("--------------------------");
		
		int c=10;
		// 0000 0000 0000 0000 0000 0000 0000 1010;
		System.out.println(c>>2); //오른쪽으로 두칸가주세요
		// 00 0000 0000 0000 0000 0000 0000 0000 10;
		System.out.println(Integer.toBinaryString(c>>2));
		System.out.println(c<<4);
		// 0000 0000 0000 0000 0000 0000 1010 0000;
		System.out.println(Integer.toBinaryString(c<<4));
	}
	
	
	

}
