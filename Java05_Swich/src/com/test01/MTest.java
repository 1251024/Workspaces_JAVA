package com.test01;

public class MTest {

	public static void main(String[] args) {
		prn01();
		prn02();
	}

	public static void prn02() {
		int i = 6;

		switch (i) {	//같은 케이스값으로 점핑, 스위치+케이스 세트임, 브레이크도 세트로 쓰면 좋음

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수입니다.");
			break;	//브레이크를 감싸고 있는 중괄호{} 밖으로 나가게 한다. 명령이 더 없어서 출력되고 끝남
		// case 2: case 4: case 6: case 8: case 10: //가로로도 쓸 수 있음, ctrl+shift+F하면 들여쓰기 자동 정렬
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("짝수입니다.");
			break;
		}

	}

	public static void prn01() {
		int i = 4;

		switch (i) {
		// 식 또는 값이 들어감, 값에 맞는 케이스로 점핑한다음 밑에 명령을 수행
		// if는 가장 위의 조건부터 순차적으로 모든 코드를 읽지만
		// switch는 해당 식/값에 맞는 case로 jumping한다.=>컴파일러가 작업하기 수월하다.
		// 조건문은 들어갈 수 없다.
		//
		// fall through
		case 1:
			System.out.println("1 입니다.");
			break; // 점핑하고서 다음 케이스값이 나오지 않게 한다.
					// 해당 케이스의 명령만 실행할 수 있게 하는 것
					// 해당 블록,바디 바깥으로 나가라
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		default: // else 같은 애
			System.out.println("1, 2, 3 아닙니다.");
		}

	}

}
