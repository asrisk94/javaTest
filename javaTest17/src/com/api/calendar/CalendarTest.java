package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		CalendarTest ct = new CalendarTest();
		
		ct.test();
		
		
	}
	
	public void test() {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"}; 
		
		String day_week = week[cal.get(Calendar.DAY_OF_WEEK)-1];
		
		System.out.printf("%d년 %d월 %d일 %s%n", year, month, day, day_week);
	}
	
//	Calendar 클래스 사용
//	오늘 날짜에 대한 객체 생성
//	년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
//	"2011년 3월 21일 월요일" 로 출력해 보시오.
	
	

}
