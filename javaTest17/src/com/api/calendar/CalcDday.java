package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcDday cd = new CalcDday();
		
		cd.test();

	}
	
//	패키지 com.api.calendar.CalcDday.test
//	사용자에게 년월일을 입력받고 Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
//	출력은 다음과 같습니다.
//	->  193일 남았습니다.
//	->  D-DAY입니다.
//	->  20일 지났습니다.
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("D-day의 해(년)를 숫자로만 입력하세요. : ");	// 입력
		int dYear = sc.nextInt();
		System.out.print("D-day의 달(월)을 숫자로만 입력하세요. : ");
		int dMonth = sc.nextInt();
		System.out.print("D-day의 날(일)을 숫자로만 입력하세요. : ");
		int dDay = sc.nextInt();
		
		
		
		Calendar cal = Calendar.getInstance();		// 지금날짜, d-day 객체
		Calendar dCal = new GregorianCalendar(dYear, dMonth-1, dDay);
		
		long now = cal.getTimeInMillis();
		long d_day = dCal.getTimeInMillis();	// 밀리초 생성
		
		long diff = (long)(Math.ceil((d_day - now)/1000.0 /60.0 /60.0 /24.0));
		// 일자 생성(나눗셈) 및 올림처리(Math.ceil)를 통해 하루 이내 차이도 명시하도록 계산
		
		
		if(diff > 0) System.out.println((int)diff + "일 남았습니다.");
		else if(diff < 0) System.out.println(-(int)diff + "일 지났습니다.");
		else System.out.println("D-day 입니다.");		// 지난 날짜에 -를 붙여주어 절대값 표시
	}

}
