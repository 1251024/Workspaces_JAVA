package com.triangle;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 			  1
 * 			1	1
 * 		  1   2   1
 * 		1   3   3   1
 *	  1   4   6   4   1
 *  1	5  10  10   5   1
 *  ....
 *  
 */
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][];
		
		//	arr[0] = new int[] {1};					//0으로 시작할 수있으나 헷갈리니 1로 시작
		//for(int i= 1; i<arr.length;i++) {
		arr[0] = new int[] {1};
		for(int i= 1; i<arr.length;i++) {
			arr[i] = new int[i+1];
			System.out.println(Arrays.deepToString(arr));
			
			for(int j=0;j<arr[i].length; j++) {
				if(j==0||j==arr[i].length-1) {
					arr[i][j] = 1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
		/*
		 * if 랑 else부분은 

3, 0 = 1 -> if 동작
3, 1 = (3-1)(1-1) + (3-1)(1) = 2, 0 + 2, 1 -> else 동작
3, 2 = (3-1)(2-1) + (3-1)(2) = 2, 1 + 2, 2 -> else 동작
3, 3 = 1 -> if 동작

이렇게 숫자 직접 넣어보면 그나마 이해할만 한거 같아요....



arr[1][0]
arr[2][0]   arr[2][1]
arr[3][0]   arr[3][1]   arr[3][2]
arr[4][0]   arr[4][1]   arr[4][2]   arr[4][3]
....


저 deepToString을 for문 안에 넣어보면 주르르르륵 바뀌는게 보여요

		 */
		prn(arr);
	}

	private static void prn(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for (int j=arr.length;j>i;j--) {
				System.out.print("  ");	//00으로 넣어보면 공백이 얼마나 떨어져있는지 알 수 있다
			} 
			for(int j=0 ; j<arr[i].length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
