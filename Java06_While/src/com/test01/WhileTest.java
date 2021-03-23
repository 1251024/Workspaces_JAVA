package com.test01;

public class WhileTest {

	public static void main(String[] args) {
		// 1.1~100까지의 숫자를 역순으로 출력하자.
		//test01();
		// 2. 1~100까지의 숫자 중, 2의 배수만 출력하자. hint:while(){if(){}}
		test02();
		// 3. 1~100까지의 숫자 중, 7의 배수의 갯수와, 7의 배수의 총 합을 출력하자.
		//3.1~100까지의 숫자 중, 7의 배수의 갯수와, 7의 배수의 총 합을 출력하자.
		//int count=0;
		//int sum=0;
		test03();
	}
	public static void test01() {
		//초기값
		int i = 100;
		//조건식
		while(i>0) {
			System.out.println(i);
			//증감식
			i--;

		}
				
	}
	public static void test02() {
		//초기값
		int i = 1;
		//조건식
		while(i<=100) {
			if(i%1==0) {
				System.out.println(i);
				}
			//만일, i가 2의 배수라면, i를 출력하자. //어떻게 해야할지는 알지만 코드를 못하겠는 경우 주석을 계속 달아서 연습하자.
		
			//증감식
			i++;
		}
	}
	public static void test03() {
		//초기값
		int i = 1;
		
		int sum=0;
		int count=0;
		
		//조건식
		 while(i<101) {
			 //i가 7의 배수인지?
			 if(i%7==0) {
				 System.out.printf("%d ",i);
				 //7의 배수의 갯수
				 count++;
				 
				 //7의 배수의 총 합
				 //sum=sum+i
				 sum=sum+i;
				 
			 }
			 //증갑식
			 i++;
		 }
		 System.out.printf("\n7의 배수의 개수: %d\n7의 배수의 총합: %d",count,sum);
	}
	
}
