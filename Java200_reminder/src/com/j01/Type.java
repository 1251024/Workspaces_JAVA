package com.j01;

public class Type {

	public static void main(String[] args) {
		//type 변수 = 값;
		int i = 10;
		String s= "20";
		
		int res = i + Integer.parseInt(s);
		System.out.println(res);
		
		String s1= new String("a");			//객체로 만들어짐  heap에 저장
		String s2 = "a";			//s2는 스트링풀에 저장
		


		
		System.out.println(s1==s2);				//false		//주소값 비교 메모리주소값이 달라서
		System.out.println(s1.equals(s2));		//true		//값자체 비교
		
	}
}
