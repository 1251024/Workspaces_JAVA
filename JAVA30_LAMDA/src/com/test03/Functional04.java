package com.test03;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional04 {

	public static void main(String[] args) {
		//supplier
		//리턴받기만 한다.
		// supplier () -> return;
		Supplier<Integer> rnum = () -> (int)(Math.random() * 45) + 1;
		System.out.println(rnum.get());
		
		
		//consumer
		//값을 넣어주면 리턴이 안되고 끝남
		//consumer(param)-> void;
		Consumer<String> hello = (name) -> System.out.println("Hello, "+ name);
		hello.accept("kh");
		
		BiConsumer<String, Integer> qclass = (subject, score) -> System.out.printf("홍길동의 %s 과목 점수는 %d 입니다. ", subject, score);
		qclass.accept("java", 78);
		
	}
}
