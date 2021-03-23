package com.test01;

import java.util.Arrays;

public class MTest01 {

	public static void main(String[] args) {
		// 배열: 여러개의 같은 타입의 값을 효과적으로 관리하기 위한 객체
		// ex)10개의 값을 담을 때 값을 담을 변수는 10개 필요함
		// int a=1; int b=2; int c=3...int j=10;
		// 100개 필요할때 int a001 = 1; int a002 = 2; ...int a100 = 100;

		// 방법 1. //여러개 담을 수 있는 방[]
		int[] a; // 선언 int[]는 타입, a;는 변수
		a = new int[5]; // 정의 a= new int[5];는 값, a라는 방을 5개 만든 것
		a[0] = 1; // 초기화
		a[1] = 2; // a라는 이름의 배열은 0번부터 시작
		a[2] = 3; // 해당 숫자만큼 연속적으로 메모리를 잡아줌
		a[3] = 4; // a라는 배열이 가지는 0번지부터 length-1번지까지 있는것
		a[4] = 5;

		// 방법 2.
		int[] b = new int[] { 5, 4, 3, 2, 1 }; // 선언 정의 초기화

		// 방법 3.
		int[] c = { 6, 7, 8, 9, 10 }; // 선언 초기화 (static한 형태로 배열을 만든다.)

		/*
		 * int sum = 0; sum= a[0]+b[1]+c[2]; System.out.printf("%d", sum);
		 */
		System.out.println(a[0]);
		System.out.println(a[0] + b[1] + c[2]);
		System.out.println(c); // [I@41a4555e 주소값 출력
								// 참조타입은 해당 변수를 호출하면 c라는 변수가 가진 주소값(메모리 위치값)이 출력
								// c라는 배열의(포장지안에) c의 0번지 하면 6이라는 값이 출력 /index로 출력
								// 그 안의 값을 실제로 보기 힘듦
		System.out.println(Arrays.toString(c)); // 자바.utill의 어레이
												// toString은 해당배열의 값을 가지고 와서 리턴(주소값을 리턴)
		String[] s = new String[] { "Have", "a", "nice", "day" };
		prn(s);
		modi(s);
	}
	
	public static void modi(String[] arr) {
		//nice -> good 변경 후 전체 출력
		//[Have, a, good, day] (Arrays.toString 사용 금지!)
		arr[2]="good";
		System.out.print("[");	
		for (int i = 0; i < arr.length; i++) {
			//System.out.printf("%s ", arr[i]);
			if(i==arr.length-1) {
				System.out.printf("%s",arr[i]);
			}else {
				System.out.printf("%s, ",arr[i]);
			}
			
		}
		System.out.println("]");
	}
	
	
	

	public static void prn(String[] arr) {	//arr은 변수이름, 변경 가능
		// {Have a nice day}->,없이 출력
		// hint! 배열은 0부터 length-1까지!
		System.out.println(Arrays.toString(arr));
		System.out.println("<" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + ">");

		
												// prn(s)라는 메소드를 호출, length는 길이
		System.out.print("{");					// 배열선언할때 []안에 length를 안넣어줘도 
		for (int i = 0; i < arr.length; i++) {	// int[] c = {6, 7, 8, 9, 10}; 처럼 몇칸인지 알아서 이해
			System.out.printf("%s ", arr[i]);
		}
		System.out.println("}");
	}
}
