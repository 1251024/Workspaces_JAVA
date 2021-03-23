package com.test01;

public class MTest {

	public static void main(String[] args) {

		prn01();
		prn02(false, false);
	}

	// 조건문안에 조건문이 또 들어갈 수 있음
	public static void prn02(boolean ring, boolean married) {
		
		if(ring) {
			if(married) {
				System.out.println("결혼하셨군요!");
			}else {
				System.out.println("연인이 있으시군요!");
			}
		}else {
			if(married) {
				System.out.println("결혼하셨군요!");
			} else {
				System.out.println("솔로이셨군요!");
			}
			
		}
			if(ring && married) {
				System.out.println("결혼하셨군요!");
			}else if(ring||married) {
				
			}else {
				System.out.println("솔로이셨군요!");
			}
		
	}

	public static void prn01() {
		int i = 10;
		int j = 20;

		// if : 만약~라면
		if (i < j) { // 만일 해당 조건이 참 이라면 //중괄호()는 바디또는 블럭이라 함
			// body(block) 안에 있는 명령들을 수행하자.
			System.out.println("i는 j보다 작습니다.");
		}
		// if ~ else
		if (i > j) {
			System.out.println("i는 j보다 큽니다.");
		} else {
			// 위의 조건이 참이 아니라면
			System.out.println("i는 j보다 크지 않습니다.");

		}
		// if ~else if ~...~else
		if (i == 2) {
			System.out.println("i는 2입니다.");
		} else if (i == 5) {
			System.out.println("i는 5입니다.");
		} else if (i == 10) {
			System.out.println("i는 10입니다.");
		} else if (i == 20) {
			System.out.println("i는 20입니다.");
		}

	}

}
