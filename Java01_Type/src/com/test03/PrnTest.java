package com.test03;

public class PrnTest {

	/*
	 * System.out.print() - 줄 바꿈 없음
	 * System.out.println() - 줄 바꿈 포함
	 * 
	 * System.out.printf(String format, Object, Object, ... args)
	 * java.util.Formatter
	 */
	
	public static void main(String[] args) {
		int i= 100;
		System.out.print("1. i:\\"+i+"\n"); //\n으로 줄 바꿈 ,\\는 문자로 표현하고 싶을때 특수문자로표현됨
		System.out.println("2. i: \t"+i); // t하나만큼 탭하나만큼 띄어짐
		System.out.printf("3. i: %10d",i); // 줄바꿈 없음, %와 d사이의 숫자만큼 자리수를 표현해 줌
		System.out.println("------------");
		
		// 예제1.
		// 시험 점수 결과는 100(su)점 이고, 학점은 'A(ch)'가 나왔다.
		// 나의 오늘 감정 지수는 90.50(d)% 이다.
		int su=100;			// 10자리
		char ch='A';		// 5자리
		double d=90.50d;	// 5자리(소수점2자리)
		// System.out.printf()를 쓰자.
		
		
		//%d  int형을 받아주는애 , %c 문자형, %s 문자열, %f 더블이나 float 받아주는 애 (api에 나와있음)
		
		System.out.printf("시험점수 결과는 %10d점 이고, 학점은 '%5c'가 나왔다.\n 나의 오늘 감정지수는 %5.2f%%이다.\n", su, ch, d);

		// 예제2.		
		// 오늘은 11\24 입니다. 제 나이는 00(age)입니다. 제 이름은 00(name)입니다.
		int age = 31;
		String name="장보옥";
		
		
		
		System.out.printf("오늘은 11\\24입니다. 제나이는 %d 입니다. 제이름은 %s 입니다.", age, name);
		
		
		System.out.printf("오늘은 11\\24 입니다. 제 나이는 %d입니다. 제 이름은 %s 입니다.", age, name);

	}
}
