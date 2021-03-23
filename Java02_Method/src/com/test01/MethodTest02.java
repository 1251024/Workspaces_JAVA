package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		// method 호출 방법
		// 1. static method : class.mehtod();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();	//privateMethod는 해당 class 내에서만(not visible : 보이지 않는다)
		//MethodTest01.abc();				//abc는 없다.(undefined : 정의되지않았다)
		
		// 2. non-static method
		// class(참조타입) 변수 = new class();
		// 변수.method();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		
		// objectaid
		// UML : Unified Modeling Languge
		//값(객체)
		//타입 변수=값;
		
		
		
		
	}
}
