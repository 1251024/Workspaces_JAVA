package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest01 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 111; i < 116; i++) {
			// map.put(k,v)
			map.put(i, i + "abc");
		}
		System.out.println(map);
		System.out.println(map.get(111));
		map.put(111, "115abc");
		System.out.println(map);

		prn(map);
	}

	public static void prn(Map<Integer, String> map) {
		Collection<String> values=map.values();
		System.out.println(values);
		
		Set<Integer>keys=map.keySet();
		System.out.println(keys);
		
		//Entry:K와 V를 같이 관리
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		//Entry<K,V>라는 객체들을 Set으로 관리하겠다.
		//Set안에서 Entry라는 객체를 가지고 있고 entry가 K,V를 관리한다.
		//set은 Integer를 사용할 수 있다.
		
		//Map은 k를 통해서 v를 가지고 올 수 있음.(map.get(k) -> value)
		//Entry는 k와 v를 각각 가지고 올 수 있음.(entry.getKey(), entry.getValue())
		//k,v에 들어가는 참조타입은 다 들어갈 수 있음
		
		for (Entry<Integer, String>entry:entrySet) {
			System.out.printf("%d:%s\n",entry.getKey(),entry.getValue());
		}
		
	}
}
