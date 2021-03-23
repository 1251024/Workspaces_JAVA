package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		Score[] kh = new Score[3];
		kh[0] = new Score("민정", 90, 89, 100);
		kh[1] = new Score("지현", 55, 100, 68);
		kh[2] = new Score("수지", 100, 40, 80);
	
		for (Score student:kh) {
			System.out.println(student);
		}
		
		Arrays.sort(kh);
		System.out.println("-----------");
		for(Score student :kh) {
			System.out.println(student);
		}
		
	}
}
