package com.j02;

public class MTest {

	public static void main(String[] args) {

		
		MyMethod.myPublic();
		MyMethod.myProtected();
		MyMethod.myDefault();
		//MyMethod.myPrivate();
		
		MyMethod my= new MyMethod();		//nonstatic 은 heap영역에 객체 생성하여 해당 메소드 호출가능
		my.myNonStatic();
	}
}
