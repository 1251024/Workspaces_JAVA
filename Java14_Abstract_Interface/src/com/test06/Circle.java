package com.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요:");
		int r = sc.nextInt();
		
		double res=r*r*Math.PI;
		setResult(res+"");
	}

	public void print() {
		System.out.println("원의 ");
		super.print();
	}
}
