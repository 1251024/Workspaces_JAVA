package com.test02;

public class ContinueTest {

	public static void main(String[] args) {
		prn();
	}
	public static void prn() {
		int i=0;
		while(i<10) {
			i++;
			if(i%2==0) {
				continue;	//컨티뉴를 만나면 밑에 내용을 뛰어넘고 다음 반복으로 넘어감
							//시스템 프린트 엘엔 명령 실행 안하고 위에 와일 조건 다시 확인하여 명령 실행
							//다음조건을 확인해서 반복하라.
							//브레이크는 종료하라
				
			}
			System.out.println(i);
		}
	}
}
