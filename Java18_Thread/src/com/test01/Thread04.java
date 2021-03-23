package com.test01;

public class Thread04 {

	public static void main(String[] args) {
		
		MyThread03 m1 = new MyThread03("야옹");
		MyThread03 m2 = new MyThread03("멍멍");
		
		long startTime = System.currentTimeMillis();
		
		m1.start();
		
		try{
			//join() : 해당 thread가 종료될때 까지 다른 thread를 멈춤
			m1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		m2.start();
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간:"+(endTime-startTime));	//실행시간 짧으면 컴퓨터 성능이 더 좋음
		//실행시간은 m1 끝나고 메인쓰레드로 실행되서 먼저나오고  그다음에 m2 시작
	}
}
