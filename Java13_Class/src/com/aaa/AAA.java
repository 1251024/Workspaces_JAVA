package com.aaa;

//public class AAA(extends Object): 자바의 모든 class는 Object를 상속 하고 있다!! (자바의 모든 클래스는 오브젝트의 자손)/extends= 상속

public class AAA {		//메인메소드는 프로젝트에 하나만 있어야 함
						//AAA 클래스는 설계도 MTest는 메인메소드
	private int abc;

	//default constructor(기본 생성자)
	public AAA() {
		System.out.println("AAA 생성");
	}
	
	
	//필드 초기화 생성자
	public AAA(int abc) {
		//파라미터 값이 생김 //파라미터 받아서 
		//this:나(객체)	//paramA라는 객체 나한테 나를 대입하자 (this를 안쓰면 해즈 노이펙트)
		//만들어질 변수를 모르기때무넹 객체 abc
		this.abc=abc;
		System.out.println("AAA 생성->abc:"+abc);
	}
	
	//getter & setter		//필드를 외부에서 접근하지 못하게 하는 이유
	public int getAbc() {			//private로 만들었기에 게터와 세터를 사용
		return abc;
	}
	public void setAbc(int abc) {
		this.abc=abc;
	}
	
	
	public void prn() {
		System.out.println("AAA의 prn() 메소드");
	}

}


/*
 <생성자>
 1. 클래스 이름과 동일 하되, 리턴타입은 없고, 객체 생성시 접근 제한자는 public
 class Test{
 	//기본생성자
 	public Test(){
 	}
 }
 
 2. 생성자는 객체 생성을 하는 new 키워드와 함께 사용되며, 생성시 단 한번만 자동 호출 된다.
 // type 변수 = new 생성자();
 Test t1 = new Test();
 
 3. 메서드처럼 객체 및 클래스명으로 호출될 수 없다.
 t1.Test(); // 에러
 
 4. overload 할 수 있다.
 class test{
 	public Test(){		//기본 생성자
 	public Test(int a){}
 	public Test(int a, int b){}
 	
 }
 
 5. 생성자를 명시하지 않으면 기본 생성자가 제공되어 멤버변수를 초기화 하고,
 명시된 생성자를 선언하게 되면 명시 생성자만 호출되고 기본생성자는 제공되지 않는다.
 
 class AAA{}					//new AAA();
 class BBB{
 	public BBB(){}				// new BBB();
 	}
 class CCCP{
 	public CCC(int a){}			// new CCC(); X -> new CCC(10);
 }
 
 6. 생성자는 상속되지 않는다.
 
 7. 생성자는 내부 호출 할 수 있으며, 기워드는 this()로 사용된다.
 
 8. 생성자의 목적은 객체 생성 및 필드 초기화에 있다.
 
 */

