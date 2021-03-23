package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.score.Score;

public class MTest02 {
	public static void main(String[] args) {

		//Score 객체 3개 만들자.
		//이름은 홍길동, 이순신, 김선달. 점수는 알아서.
		Score s1 = new Score();
		s1.setName("홍길동");
		s1.setKor(89);
		s1.setEng(56);
		s1.setMath(92);

		Score s2 = new Score("이순신", 57,81,100);
		Score s3 = new Score("김선달", 79,100,50);
		
		//Score 객체를 관리할 수 있는 Set객체를 만들자.
		//Set type에, HahSet으로 만들자.
		
		Set<Score>set = new HashSet<Score>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(new Score("샤넬",100,100,100));


		//printCollection(set);
		transElement(set, "홍길동", 10);
	
	}
	
	public static void transElement(Set<Score> set, String target, int kor) {
		//set에서 "홍길동"을 찾아서, 국어점수를 10점으로 바꾸고, 전체 출력
		//찾을 때 iterator를 사용하자!!
		Iterator<Score> itr = set.iterator();
		while (itr.hasNext()) {
			/*
			if(itr.next().getName() == target) {
				itr.next().setKor(kor);
			}
			*/
			Score temp = itr.next();
			if(temp.getName().equals(target)) {		
				//==임시값 temp를 바꿨는데 ir로 출력했을때 바뀐다는건 call by reference로 동작한
				//문자열 비교는 .equals
				
				temp.setKor(kor);
			}
		}
		//출력
		Iterator<Score> ir=set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());

		}
	}
	
	public static void printCollection(Set<Score>set) {
		//1.향상된 포이치문
		for (Score sc:set) {
			System.out.println(sc);
		}
		
		System.out.println("---------------");
		
		//2.set.toArray메소드 사용 (오브젝트 배열로 리턴)	//이름과 평균만 전체 출력
		Object[] oArr = set.toArray();
		for (int i= 0; i<oArr.length;i++) {
			//System.out.println(oArr[i]);
			//System.out.println(oArr[i].getName());	//Object type이라서 스코어가 가진 메소드를 사용 할 수 없다.
														//부모클래스라서 , 스코어도 오브젝트를 상속받고 있음, 오브젝트 타입으로 감싸져있음
														//예를 들면 object o= new Score(); 
			System.out.println(
					((Score)oArr[i]).getName()+"\t"+String.format("%.2f", ((Score)oArr[i]).getAvg())	//부모를 형변환해야 쓸 수 있다.
					);
					//System.out.printf("%s \t %.2f\n",((Score)oArr[i]).getName(),((Score)oArr[i]).getAvg());
		}
		
		System.out.println("=======================");
		
		
		//3.Iterator:컬렉션 저장 요소를 읽어오는 표준화된 방법
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) {						//hasNext = 다음거 있니?(토크나이저 같은 기능) 
			System.out.println(iterator.next());			//커서는 이터레이터가 가지고 있음
		}
	}
}
