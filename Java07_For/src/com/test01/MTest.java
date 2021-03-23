package com.test01;

public class MTest {

	public static void main(String[] args) {
		// prn01();
		// prn02();
		prn03();
	}

	public static void prn01() {
		// for(초기값;조건식;증감식) { } //1. 초기값 2.조건식 3. 명령문(조건식이 참이면) 4.증감식
		for (int i = 0; i < 10; i++) { // 1,2,3조건식 참일때,4 이후는 2->3->4 반복
			System.out.println(i);
		}

	}

	public static void prn02() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void prn03() {
		
		for (int i=0;i<10;i++) {		//커다란 반복문안에 i
		
			for(int j=0;j<10;j++) {			//작은 반복문 안에 j	//지역변수
			
				System.out.printf("%d, %d\n", i, j);	//breakpoint
				//Debug 오류찾는 툴(debugging=오류를 찾자)
				//해당라인 더블클릭하고 디버그버튼 클릭하면 상기 명령을 실행하기 전까지로 멈춤(0,0출력전)
				//F8 실행전 ㅁ빨간네모 눌러서 터미네이티드하기
				//F11 디버그 모드 / ctrl+F11=run 디버그 못쓰면 런으로 확인
				//선언되어있는 반복문안에서만 사용됨//지역변수
			}
			
			System.out.println();
		}

	}
}
