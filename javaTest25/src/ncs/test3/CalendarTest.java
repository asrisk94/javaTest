package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class CalendarTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		
		
		Calendar c = new GregorianCalendar(year, month-1, day);		// 캘린더의 달은 0~11 기준.
		Date d = new Date(c.getTimeInMillis());						// 밀리초 변환
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일");	// 소문자 mm은 미닛(분)
		
		
		
		System.out.println();
		System.out.println("입력하신 날짜에 대한 정보는 다음과 같습니다.");
		
		System.out.println(sdf.format(d));		// 밀리초를 받은 데이트형 객체를 심데포에 넣어 출력
		System.out.print(year + "년은 ");
		
		if((year%4==0 && year%100 !=0) || year%400==0)		// 인터넷에서  찾은 윤년의 기준
			System.out.println("윤년이다.");
		else
			System.out.println("윤년이 아니다.");
	}

}
