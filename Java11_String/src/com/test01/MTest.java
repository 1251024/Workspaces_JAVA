package com.test01;

public class MTest {

	private static String str = "The String class represents character strings.";

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s + 1 + 2);
		System.out.println(1 + 2 + s);
		System.out.println(s); // Immutable

		// s=1+2+s;
		// System.out.println(s);

		String h = "Hello"; // 기본타입처럼 쓸수있어서 스트링풀에서 가져옴
		System.out.println(h);
		System.out.println(s == h);

		String newS = new String("Hello");
		System.out.println(newS);
		System.out.println(s == newS);
		// equals는 값이 같냐고 물어보는거고, == 은 주소가 같냐고 물어보는 거다
		System.out.println("----------------------");

		// 1.str의 길이
		test01();

		// 2.str전체 대문자
		test02();

		// 3.
		test03();

		// 4. str에서 첫번째로 나오는 c의 위치(인덱스)
		test04();

		// 5.class단어를 찾아서 java로 바꿔서
		test05();

		// 6.character 단어를 찾아서 대문자로 변환 후, 전체 출력
		test06();

		// 7.str 을 char[]로 출력하되, 'c'만 출력하자.
		// 그리고, c의 갯수를 출력
		test07();

		// 8. str을 char[]로 출력하되, 대문자만 출력하자.
		// 그리고, 대문자의 갯수를 출력
		test08();

		// 9.str 사이의 공백 제거 후 출력
		test09();

		// 10. 전체를 역순으로 출력
		test10();

	}

	private static void test10() {	//여러방법중 하나임
		int arrIndex=0;
		char[]ch=new char[str.length()];
		
		for (int i = str.length()-1;i>=0;i--) {
			ch[i]=str.charAt(arrIndex);
			arrIndex++;
		}
		System.out.println(ch);
	}

	private static void test09() {
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll(" ", ""));
	}

	private static void test08() {
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			// ch[i]->"char"->isUpperCase();
			if (Character.isUpperCase(ch[i])) {
				System.out.printf("%c ", ch[i]);
				count++;
			}
		}
		System.out.println("\n대문자의 갯수:" + count);
	}

	private static void test07() {
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			// System.out.print("%c", ch[i]);
			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.printf("%c ", ch[i]);
				count++;

			}
		}
		System.out.println("\nc의 갯수: " + count);
	}

	private static void test06() {
		// character 찾아서
		String target = "character";
		int start = str.indexOf(target);
		int end = start + target.length();
		String upper = str.substring(start, end);

		// 대문자로 변환
		upper = upper.toUpperCase();

		// 전체 출력
		System.out.println(str.replace(target, upper));
	}

	private static void test05() {
		System.out.println(str.replace("class", "java"));
	}

	private static void test04() {
		System.out.println(str.indexOf('c'));
	}

	private static void test03() {
		System.out.println(str.toLowerCase());
	}

	private static void test02() {
		System.out.println(str.toUpperCase());
	}

	private static void test01() {
		System.out.println(str.length());
	}
}