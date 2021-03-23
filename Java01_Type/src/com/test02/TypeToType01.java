package com.test02;

public class TypeToType01 {

	public static void main(String[] args) {
		
		//아스키코드

		// 1. int to char
		int i = 65;
		char c = (char)i;
		System.out.println(c);
	
		// 2. char to int;
		char c2='B';
		int i2 =(int)c2;
		System.out.println(i2);
		
		char c3='1';
		char c4='9';
		int i3=c3+c4;
		System.out.println(i3);
		
		// 3. String to int
		String str="33";
		System.out.println(str+1);
		int i4 = Integer.parseInt(str);	//parseInt
		System.out.println(i4+1);
		
		
		// 4. int to String
		int i5=55;
		System.out.println(i5+1);
		String s5=Integer.toString(i5);	//toString
		System.out.println(s5+1);
		String s6=String.valueOf(i5);	//valueOf 함수 형변환해주는 함수
		System.out.println(s6+1);

	}
}
