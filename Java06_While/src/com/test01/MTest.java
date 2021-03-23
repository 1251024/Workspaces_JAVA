package com.test01;

public class MTest {
	//조건이 거짓이 될때까지 반복함
	//do는 조건이 거짓이라도 적어도 한번 1번 하고 조건이 참이면 반복, 

	public static void prn02() { 
		int i=10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("while이 끝난 후의 i : "+i);
	}
	
	public static void prn03() {
		
		int i= 1;
		
		while (true) {	//냉장고 같이 계속 실행되어야 하는 것
			System.out.println(i);
			i++;	//무언가 계속해서 실행되는 상태로 만들어 놓을 때, 종료할 수 있는 조건을 만들어 줘야힌다
			
			if (i==10) {
				break;

			}
		}
	}
	public static void main(String[] args) {
		//prn01();
		//prn02();
		prn03();
	}
	
	public static void prn01() {	//while 블록안에 조건이 참일 경우 명령을 수행한다음 다시 조건을 보러 오고 출력한다. 계속 출력한다.
									//어떤상황에서 와일이 종료될까?=초기, 조건, 증감
									//명령 수행 안하고 끝다고 다음 명령을 수행함
		//초기값
		int i = 10;
		
		//조건식
		while(i<10) {
			System.out.println(i);
			
			//증감식
			i++;
				
	
		}
		System.out.println("While이 종료된 이후의 i :"+i);
	}
}
