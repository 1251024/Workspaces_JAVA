package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {	
		//타입 변수는 = 값(객체);	
		//type 변수 = new 생성자();	//타입의 값을 만들어 줌
		AAA myA = new AAA();		//new AAA는 값(객체)인데 인스턴스를 만들어주는 생성자가 객체를 만들어주는 역할
		myA.prn();
		//참조타입 = 값(=instance 객체)	//new랑 생성자랑 만나면 인스턴스를 만들어줌
		//클래스를 객체로 만들어 주는것을 new 생성자(); 
		//아무것도 안쓰면 JVM이 생성자를 자동으로 만들어 줌
		//클래스를 객체로 만들었다(인스턴스화)
		
		/*
		 * AAA에서 만들어 놓은 클래스가 MTest에서는 new생성자이름(); 이라는 
		 * 문법을 사용해서 객체로 만들어 사용하는 것
		 */
		System.out.println("myA.getter:" +myA.getAbc());
		
		
		AAA paramA = new AAA(10);
		paramA.prn();
		System.out.println("abc :"+ paramA.getAbc());
						//게터에서 값을 가져오자 get이나 set 뒤에 첫글자는 대문자!!
						//다른 언어에서 편리하게 사용하는 언어를 사용 못할 수 잇음
						//카멜표기법
		//게터는 외부에서 요 객체에 값을 가져와
		//세터는 내가 값을 넣어줄게
		paramA.setAbc(100);
		System.out.println("abc : " + paramA.getAbc());
		System.out.println("=========================");
		BBB b1 = new BBB();	//부모객체가 만들어진 후에 자식객체가 만들어짐
							// AAA가 먼저 만들어지고 BBB가 만들어짐
		//b1에 AAA주소값에 BBB도 있다 묶여저있는 한세트의 주소값을 받는다.
		//객체BBB가 먼저 만들어지기 전에 부모 생성자를 호출해서 AAA객체가 먼저 만들어진다.
		//부모 호출하지않아도 부모의 기본생성자 호출
		//부모것을 자식이 그냥 가져올 수 있음, 자식거는 부모가 못가져 옴
		b1.setAbc(10);
		b1.setBcd(20);
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(15);
		System.out.println(b2.getSum());
		//뉴BBB가 BBB를 호출했는데 BBB의 슈퍼가 부모생성자를 호출
		//this.abc에 15가 저장됨 bcd는 10
		//겟섬에서 get abc는 15를 리턴, get bcd 10을 더해서 리턴한다
		
		BBB b3 = new BBB(20, 50);
		System.out.println(b3.getSum());
		System.out.println("=========================");

		AAA a1 = new AAA();
		AAA a2 = new BBB();
		//BBB a3 = new AAA();		//자식타입으로 부모 받는 거 안됨
		a1.prn();
		a2.prn();	//타입은 부모 AAA인데, 실제 들어간 값은 BBB
		//부모의 prn 메소드를 통해서 자식의 prn 메소드가 호출된 것임
		a2.getAbc();
		//a2.getBcd();	//AAA로 정의되어 AAA것을
		((BBB) a2).getBcd();
	
/*
 * 남자 a1 = new 여자();

a1.여자화장실(); -> 실제 여자가 아니여서 안됨.
((여자) a1).여자화장실(); -> 여자로 Type 변환 후 가야함.

요런 느낌

 */
		
	}	
}
