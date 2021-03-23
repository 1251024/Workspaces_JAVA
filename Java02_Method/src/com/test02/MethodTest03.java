package com.test02;

import com.test01.MethodTest01;		//다른 클래스 메소드 가져올땐 import 사용

public class MethodTest03 {

	
	public static void main(String[] args) {
		// 1. static method
		
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod();	//같은패키지가 아니여서 사용할 수 없음
		//MethodTest01.defaultMethod();		//같은패키지가 아니여서 사용할 수 없음
		//MethodTest01.privateMethod();		//같은 클래스가 아니여서 사용할 수 없음
		
		// 2. non-static method
		MethodTest01 test =new MethodTest01();
		test.nonStaticMethod();
		
		
	}
}
