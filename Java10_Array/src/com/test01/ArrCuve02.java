package com.test01;

public class ArrCuve02 {
	/*
	 *  1  2  3  4  5 
	 * 10  9  8  7  6 
	 * 11 12 13 14 15 
	 * 20 19 18 17 16
	 * 21 22 23 24 25
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 1;

		// 값 저장
		for (int i = 0; i < arr.length; i++) {

			// i=0,2,4
			if (i % 2 == 0) {
				// 정방향
				for (int j = 0; j < arr[i].length; i++) {
					arr[i][j] = cnt++;
				}
			} else {
				// 역방향
				for (int j = arr[i].length-1 ; j >= 0; j--) {
					arr[i][j] = cnt++;
				}
			}
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();
		}

	}

}
