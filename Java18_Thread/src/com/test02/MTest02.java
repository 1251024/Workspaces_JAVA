package com.test02;

public class MTest02 {

	public static void main(String[] args) {
		
		while(true) {
			for(int i= 1;i<=10;i++) {
				
				
				try{
					//Thread를 해당 millis만큼 sleep
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("%c ",'♥');
			}
			System.out.println();
		}
	}
}
