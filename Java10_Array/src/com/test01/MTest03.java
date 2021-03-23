package com.test01;

public class MTest03 {

	public static void main(String[] args) {
		int[][] arr = new int [3][3];
		int cnt = 1;
		
		//만들기
		for(int i = 0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[j][i]=cnt++;
				System.out.printf("%2d",arr[j][i]);
			}
			System.out.println();

		}
		
		//출력하기
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length;j++){
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
