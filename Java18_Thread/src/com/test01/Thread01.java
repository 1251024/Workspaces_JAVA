package com.test01;

class MyThread01 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i<10;i++) {
			System.out.println("i:"+i);;
		}
	}
}
public class Thread01 {
	
	//main thread이다.=> 우선순위가 높다.
	public static void main(String[] args) {
		System.out.println("main start--------");
		
		//Thread가 아니다							//클래스를 객체로 만들때 사용
		/*
		MyThread01 my01 = new MyThread01();
		MyThread01 my02 = new MyThread01();
		
		my01.run();
		my02.run();
		*/
		
		//Thread이다								//혼자 따로따로 노는것, 동시에 실행되고 있어서
		Thread my01 = new Thread(new MyThread01());
		Thread my02 = new Thread(new MyThread01());
		
		my01.start();
		my02.start();
		
		
		System.out.println("main stop--------");
	}
}
