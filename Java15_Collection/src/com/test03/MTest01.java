package com.test03;

import java.util.HashSet;
import java.util.Set;

public class MTest01 {
	// Set:순서 x, 중복 x
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("4");
		set.add("6");
		set.add("7");
		//set.add(null);	//null값은 저장은 가능하나, 사용하면 NullPointerException 발생!
		set.add("3");		//set은 순서도 없고 중복도 없다 중복된 값은 들어가지 않는다.
		
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();

		findElement(set, "3");
		deleteElement(set,"3");
	}
	public static void deleteElement(Set<String>set, String delete) {
		for(String s:set) {
			if (s.equals(delete)){
				set.remove(s);
				System.out.println(delete+"지웠다!!"); 
				//전체개수에서 하나씩 가져오던거였는데 다음거 못해라고 브레이크걸면 나머지것은 찾지않음
				break;//예외발생하기 전에 나가기
			}
		}
		System.out.println(set);
	}

	public static void findElement(Set<String> set, String find) {
		/*
		 * for (int i= 0; i<set.size();i++) { set.get(i); }
		 */
		for (String s : set) {
			if (s.equals(find)) {
				System.out.println(find + " 찾았다!!");
			}
		}
	}
}
