package com.test01;

public class MTest {

	public static void main(String[] args) {
		AA a = new AA();
		Super s = a;	//Super AA =s
		//Super s에다가 a가 가진 newAA()한 "instance"의 주소값 대입
		//s 에다가 a 의 주소값을 넣어준것

		BB b = (BB) s;	//cannot be cast to class 오류남
		//s에 담긴 AA instance를  BB로 형변환
		//자식객체끼리는 서로 바꿀수 없다.
		//부모가 자식은 안되고
		//자식은 부모 되고
		//자식 자식끼리는 안되고
		
		
	

		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
		//hashcode는 주소값
		//a의 주소값과 s의 주소값은 같다.
		
	}
}
