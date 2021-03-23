package com.bbb;

import com.aaa.AAA;

// super: 부모(상속) 	this -> super
				//  나 extend 부모

public class BBB extends AAA {

	 private int bcd;
	 
	 public BBB() {
		 // super();			//자식객체를 만들려면 부모객체가 먼저 있어야 함
		//부모 호출하지않아도 부모의 기본생성자 호출
		 System.out.println("BBB 생성");	
	 }
	 
	 public BBB(int abc) {
		 // 부모생성자 (param) 호출(MTest의 AAA)
		 super(abc);
		 bcd = 10;
		 System.out.println("BBB생성 -> abc :" + abc);
		 
	 }
	 public BBB(int abc, int bcd) {
		 super(abc);
		 this.bcd = bcd;
		 System.out.printf("BBB생성->abc : %d, bcd: %d\n", abc, bcd);
	 }
	 
	 public int getBcd() {
		 return bcd;
	 }
	 public void setBcd(int bcd) {
		 this.bcd=bcd;
	 }
	 public int getSum() {
		 //int sum= super.getAbc() + this.getBcd();
		 int sum = getAbc()+getBcd(); //슈퍼것 가져오기때문에 생략 가능
		 return sum;
	 }
	 
	 @Override			//재정의 : 똑같은 이름으로 상속받아서 확장했다(자식객체라서 가능)
	 public void prn() {
		 System.out.println("BBB.prn()");
	 }
}
