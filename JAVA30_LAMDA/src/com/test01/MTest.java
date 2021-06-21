package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		
		//1. 한번쓰고 마는 익명 객체함수
		Test01 test01_1 = new Test01() {
			public void prn() {
				System.out.println("Interface 구현!");
			}
		};
		test01_1.prn();
		
		//new Test01() { }는 익명함수를 구현, 익명 객체임
		//자바스크립트도 익명 함수
		
		
		//2. 람다
		//() -> {code};
		Test01 test01_2 = () -> {System.out.println("Lamda!");};
		test01_2.prn();
		//() 메소드의 파라미터 부분
		//{} 는 메소드의 body부분
		
		//@FunctionalInterface여야만 람다가 가능, @FunctionalInterface가 메소드 하나뿐이라
		
		//3. 람다
		//() -> code;
		Test01 test01_3 = () -> System.out.println("Lambda! 재밌다!");
		test01_3.prn();
		
		//Test01 인터페이스를 상속받아서 구현해야함.
		
		System.out.println("-------------------------------");
		//파라미터 받아서 출력함
		
		//(parameter) -> {};
		Test02 test02_1 = (int i) -> {System.out.println("input: "+i);};
		test02_1.prn(10);
		
		Test02 test02_2 = (i) -> {System.out.println("input: "+i);};
		test02_2.prn(20);
		
		//parameter -> {};
		Test02 test02_3 = i -> System.out.println("input: "+i);
		test02_3.prn(30);
		
		
		System.out.println("-------------------------------");
		
		//parameter -> {return };
		Test03 test03_1 = i -> {return i + 10;};
		System.out.println(test03_1.prn(10));
		
		//parameter -> code; //return 생략
		Test03 test03_2 = i -> i+20;
		System.out.println(test03_2.prn(10));
		
		System.out.println("-------------------------------");
		
		//(param1, param2) -> {return code;};
		Test04 test04_1 = (n, m) -> {return n + m;};
		System.out.println(test04_1.prn(10, 20));
		//파라미터 이름이 달라도 됨
		
		
		//(param1, param2) -> code;
		Test04 test04_2 = (n, m) -> n*m;
		System.out.println(test04_2.prn(10, 20));
		//리턴하고 명령 하나일때만 리턴 생략이 가능!
		
		
		//(param1, param2) -> {code; return code;};
		Test04 test04_3 = (n, m) -> {
			System.out.printf("%d * %d = ", n, m);
			return n * m;
		};
		System.out.println(test04_3.prn(30, 40));
		//명령이 여러개 일 땐 리턴이 꼭 있어야한다. 
	}
}
