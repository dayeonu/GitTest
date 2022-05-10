//https://docs.oracle.com/javase/8/docs/api/ 캘린더 참조 할 것. 

package com.ezen.ex01;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {

		final int[] TIME_UNIT = { 3600, 60, 1 };
		final String[] TIME_UNIT_NAME = { "시간", "분", "초" };
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//set()메서드 사용. 
		//날짜와 시간을 원하는 값으로 변경할 수 있다 
		//time1을 10시 20분 30초로 지정함. 
		time1.set(Calendar.HOUR_OF_DAY, 10); 
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		//time2를 20시 30분 10초로 지정함. 
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		
		//두 개의 시간 데이터로부터 초 단위로 차이를 구한다음 
		System.out.println("time1 :" + time1.get(Calendar.HOUR_OF_DAY)+"시 " +time1.get(Calendar.MINUTE)+"분 "+ 
				time1.get(Calendar.SECOND)+"초");
		System.out.println("time2 :" + time2.get(Calendar.HOUR_OF_DAY)+"시 " +time2.get(Calendar.MINUTE)+"분 "+ 
				time2.get(Calendar.SECOND)+"초");
		
		
		//자바에서 제공하는 getTimeInMillis 메소드 사용. <<getTimeInMillis : 해당 시간의 1/1000 초 단위 시간>> 
		long difference =
				Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference +"초 입니다");
		
		// 시분초로 바꿔 출력한다. 
		//가장 큰 단위인 시간 단위 3600초로 나누고 나머지를 다시 분 단위 60초로 나누면 그 나머지는 초 단위의 값이 된다. 
		String tmp = "";
	
		// x시간 - y분 -z초 순으로 
		// 나머지 
		for(int i =0; i<TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 "+tmp + "입니다. ");
	}
}

//	두 날짜간의 차이를 얻으려면, getTimeInMillis()를 이용해서 천분의 일초 단위로 변환해야한다.
// 1일 = 24 * 60 * 60
// ((이후 날짜).getTimeInMillis() - (이전 날짜).getTimeInMillis()) / 1000  => 초
// milli second 단위이기 때문에 /1000을 해서 second 단위로 변환 
// 초단위 값으로 차이를 구한 후, " 일(日) 단위 "로 변환 ( 24＊60＊60 )해서 사용해도 된다. => 날
// 초단위 값에 대해
// x시 y분 z초 형식으로 만들기 위해서는
// " 큰 단위부터 '몫'과 '나머지'를 활용해서 연산 "하면 편리하다.
// ( 단계별 단위값 계산하는 문제 유형에서 활요할 수 있다 : ex. 돈을 500원, 100원, 50원 동전별로 분류 )
