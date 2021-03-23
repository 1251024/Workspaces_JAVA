package com.test01;

/**
 * javadoc TEST <br>
 * Hello, World!를 출력하는 class<br><br>
 * 
 * javadoc 만드는 방법<br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe<br>
 * VM옵션에
 * -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8
 * 추가!
 * 
 * @author USER
 *
 */
public class Type01 {
	
	//접근제어자 메모리영역  리턴값 메소드명 (파라미터 아규먼트)
	public static void main(String[] args) {

		// 주석 : 사람을 위한 설명
		// 주석 = 설명
		System.out.println("Hello, World!");
		/*
		 * 여러 줄 주석
		 * 주석을 많이 남겨야 할 때
		 * 이렇게 사용해요.
		 * 주석의 종류는 두가지
		 * 
		 * complie시, 주석은 제거됨
		 */
	}
}
