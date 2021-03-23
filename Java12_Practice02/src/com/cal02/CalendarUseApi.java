package com.cal02;

import java.util.Calendar;

//달력 만들기
//java.util.Calendar 사용해서 만들기

// Calendar rightNow = Calendar.getInstance();	<<= singleton 패턴

public class CalendarUseApi {

	public void prn(int year, int month) {

		// Calendar 객체 생성
		// Calendar cal = new Calendar(); X -> singleton
		Calendar cal = Calendar.getInstance();

		// 달력 윗부분												//내가 해석
		System.out.printf("\t\t%d년 %d월", year, month);		//입력한 연도와 달을 표시해주고	\t 는 탭
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");		//달력 상단에 요일을 표시해준다
		
		//시작 날짜 설정
		//month-1:Calendar는 0부터 시작(재뉴어리가 0)
		cal.set(year, month - 1, 1);						//set이라는 메서드는 시간이나 달력필드값을 입력하기 전까지는 해석되지 않음
															//년도와 해당 달에서 한달을 빼줘서 계산을 해줘야
		//일요일 :1, 월요일 2, ... 토요일:7
		int start = cal.get(Calendar.DAY_OF_WEEK);			//데이오브 위크는 세팅된 요일을 나타낸다 //시작날짜에 대입해주고

		//일요일이 1이기 때문에 1부터 시작
		for (int i = 1; i < start; i++) {					//i=1이라고 선언 후 1보다 작으면 시작날짜 공백 만들어주기같음
			System.out.print("\t");
		}
		
		// 달력 출력
		// getActualMaximum:현재 날짜(월)의 가질 수 있는 최대값
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {	//7일을 최대로 잡고 요일에 날짜를 출력해주는것같음	
			System.out.printf("%d\t", i);
			if (start % 7 == 0) {						//일주일 7개가 출력되면 줄바꿔주는것
				System.out.println();
			}
			start++;
		}

	}

}
