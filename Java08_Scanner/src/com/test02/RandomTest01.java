package com.test02;

import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		useMathClass();
		useRandomClass();
	
		
	}
	
	//java.util.Random
	public static void useRandomClass() {
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
	}
	
	
	
	//java.lang.Math
	public static void useMathClass() {
		//0<=ran<1	▶ 0보다 크거나 작고 1보다 작은 실수 값이 나옴
		double ran=Math.random();
		//System.out.println(ran);
		
		int min = 20;
		int max = 30;
		//(int)(Math.random()*(max-min+1))+min;
		//min~max(max 포함)
		int rd=(int)(Math.random() *(max-min+1))+min;
		System.out.println("random:"+rd);
		
	}
}
