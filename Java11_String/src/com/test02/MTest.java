package com.test02;

public class MTest {

	public static void main(String[] args) {
		//sTest();
		sBufferTest();
	}
	
	//string을 +연산으로 연결할 때, 내부적으로 StringBuilder로 더해준다.(jdk 1.5)
	public static void sTest() {
		//immutable
		String s="안녕하세요.";
		System.out.println(s.hashCode());

		s+="저는 ";
		System.out.println(s.hashCode());

		s+="장보옥 입니다.";		
		System.out.println(s.hashCode());

		System.out.println(s);
		
		//안녕하세요->하이
		
		System.out.println(s.replace("안녕하세요.",  "하이!"));
		System.out.println(s);
		
		s=s.replace("안녕하세요.", "하이!");
		System.out.println(s);
		System.out.println(s.hashCode());
	}
											//StringBuilder //single thread
											//String Buffer //multi thread
	public static void sBufferTest() {		//대입하지 않아도 값이 바뀜, 멀티스레드에서 사용
		//mutable 가변의, 주소는 변하지 않고 해당 값이 변했다.
		
		StringBuffer sb=new StringBuffer();
		//method chaining
		sb.append("안녕하세요").append("저는").append("장보옥입니다.");
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.replace(0, 5,"하이!"); 
		System.out.println(sb);		//메모리안에 객체를 만들게 했음, 객체는 안변하지만, 객체의 값이 변함
		
		//거꾸로 출력
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
