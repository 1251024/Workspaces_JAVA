package com.test02;

import java.util.Scanner;

public class MTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("메뉴 선택");
		System.out.println("1:전체 전택 2:특정 부서 선택 3: 부서 추가 4: 부서 수정 5: 부서 삭제 6: 종료");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			selectList();
			break;
		case 2:
			selectOne();
			break;
		case 3:
			insert();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
		case 6:
			System.out.println("종료");
			break;

		}
	}

	private static void delete() {
		
	}

	private static void update() {
		
	}

	private static void insert() {
		
	}

	private static void selectOne() {
		
	}

	private static void selectList() {
		
	}
}
